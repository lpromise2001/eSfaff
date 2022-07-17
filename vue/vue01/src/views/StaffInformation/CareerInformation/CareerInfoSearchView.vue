<template>
	<div id="container">
		<div id="search_content">
			<el-form label-width="100px" size="large">
				<el-form-item label="员工编号:">
					<el-input placeholder="支持模糊查询" v-model="CareerInfo.staff_no"></el-input>
				</el-form-item>
				<el-form-item label="公司名称">
					<el-input placeholder="支持模糊查询" v-model="CareerInfo.company_name"></el-input>
				</el-form-item>
				<el-form-item label="岗位:">
					<el-input placeholder="支持模糊查询" v-model="CareerInfo.p_name"></el-input>
				</el-form-item>
				<el-form-item>
					<el-button type="primary" @click="search()">搜索</el-button>
				</el-form-item>
			</el-form>
		</div>
		<div id="search_result">
			<el-table :data="CareerInfos" :border="true" :stripe="true">
				<el-table-column label="员工编号" prop="staff_no"></el-table-column>
				<el-table-column label="起始年月" prop="start_time"></el-table-column>
				<el-table-column label="截止年月" prop="end_time"></el-table-column>
				<el-table-column label="所在单位名称" prop="company_name"></el-table-column>
				<el-table-column label="从事工作内容" prop="job_description"></el-table-column>
				<el-table-column label="担任职务" prop="p_name"></el-table-column>
				<el-table-column label="月薪" >
					<template #default="scope">
						{{scope.row.monthly_salary}}
					</template>
				</el-table-column>
				<el-table-column label="备注" prop="notes"></el-table-column>
			</el-table>
		</div>
	</div>
</template>

<script>
	export default {
		name: "BookSearchView",
		data() {
			return {
				CareerInfo: {
					staff_no: '',
					start_time: '',
					end_time: '',
					company_name: '',
					job_description: '',
					p_name: '',
					monthly_salary: '',
					notes: ''
				},
				CareerInfos: []
			}
		},
		methods: {
			search() {
				// this.$axios.post("http://localhost:8088/demo/book/findByParam", this.book)
				// 	.then(rst => {
				// 		console.log(rst.data);
				// 		this.books = rst.data.result;
				// 	}).catch(err => {
				// 		console.log(err);
				// 	})
			}
		}
	}
</script>

<style>
</style>
