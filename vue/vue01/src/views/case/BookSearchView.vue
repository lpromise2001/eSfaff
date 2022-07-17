<template>
	<div id="container">
		<div id="search_content">
			<el-form label-width="100px" size="large">
				<el-form-item label="图书名称:">
					<el-input placeholder="支持模糊查询" v-model="book.bookName"></el-input>
				</el-form-item>
				<el-form-item label="作者:">
					<el-input placeholder="作者姓名" v-model="book.author"></el-input>
				</el-form-item>
				<el-form-item label="图书价格:">
					<el-col :span="2">
						<el-input placeholder="下限" v-model="book.minPrice"></el-input>
					</el-col>
					<el-col :span="1" style="text-align: center;">
						<span>--</span>
					</el-col>
					<el-col :span="2">
						<el-input placeholder="上限" v-model="book.maxPrice"></el-input>
					</el-col>
				</el-form-item>
				<el-form-item>
					<el-button type="primary" @click="search()">搜索</el-button>
				</el-form-item>
			</el-form>
		</div>
		<div id="search_result">
			<el-table :data="books" :border="true" :stripe="true">
				<el-table-column label="编号" prop="bookId"></el-table-column>
				<el-table-column label="名称" prop="bookName"></el-table-column>
				<el-table-column label="价格">
					<template #default="scope">
						{{scope.row.price}}
					</template>
				</el-table-column>
				<el-table-column label="作者" prop="author"></el-table-column>

			</el-table>
		</div>
	</div>
</template>

<script>
	export default {
		name: "BookSearchView",
		data() {
			return {
				book: {
					bookName: '',
					author: '',
					minPrice: '',
					maxPrice: ''
				},
				books: []
			}
		},
		methods: {
			search() {
				this.$axios.post("http://localhost:9001/consumer/book/findByParam", this.book)
					.then(rst => {
						console.log(rst.data);
						this.books = rst.data.result;
					}).catch(err => {
						console.log(err);
					})
			}
		}
	}
</script>

<style>
</style>
