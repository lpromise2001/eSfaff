<template>
	<div id="container">
		<el-form label-width="120px">
			<el-form-item label="书名">
				<el-input placeholder="输入书籍名称" v-model="book.bookName"></el-input>
			</el-form-item>
			<el-form-item label="作者">
				<el-input placeholder="输入书籍作者" v-model="book.author"></el-input>
			</el-form-item>
			<el-form-item label="价格">
				<el-input-number :precision="2" :step="0.1" v-model="book.price"></el-input-number>
			</el-form-item>
			<el-form-item>
				<el-button type="primary" @click="add()">添加</el-button>
			</el-form-item>
		</el-form>
	</div>
</template>

<script>
	export default {
		name: 'BookRegView',
		data() {
			return {
				book: {
					bookName: '',
					author: '',
					price: 0
				},
				books: []
			}
		},
		methods: {
			add() {
				//获取页面中控件的值
				let str = JSON.stringify(this.book);
				console.log(str)
				this.$axios.post("http://localhost:9001/consumer/book/addBook", this.book)
					.then(rst => {
						if (rst.data.code == 200) {
							// this.$message("操作结束");
							this.$alert("操作成功", "成功");
						} else {
							this.$alert("操作失败", "失败");
						}
						console.log(rst.data);
					}).catch(err => {
						console.log(err);
					})
			}
		}
	}
</script>

<style scoped>
	#container {
		width: 100%;
		height: 100%;
		/* 弹性布局 */
		display: flex;
		/* 伸缩方向：列方向 */
		flex-direction: column;
		/* background-image: url("../../assets/image03.jpg"); */
		background-color: aliceblue;
	}
</style>
