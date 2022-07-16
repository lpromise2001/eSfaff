<template>
	<div id="container">
		<div id="search_content">
			<el-form label-width="100px" size="large">
				<el-form-item label="部门编号:">
					<el-input placeholder="" v-model="department.dep_id"></el-input>
				</el-form-item>
				
				<el-form-item label="部门名称:">
					<el-input placeholder="支持模糊查询" v-model="department.dep_name"></el-input>
				</el-form-item>
				
				<el-form-item label="部门经理:">
					<el-input placeholder="" v-model="department.dep_manager"></el-input>
				</el-form-item>
				
				<el-form-item label="部门电话:">
					<el-input placeholder="" v-model="department.dep_phone"></el-input>
				</el-form-item>
				
				<el-form-item label="部门描述">
					<el-input placeholder="" v-model="department.dep_description"></el-input>
				</el-form-item>	
				
				<el-form-item label="建立日期">
					<el-input placeholder="" v-model="department.dep_date"></el-input>
				</el-form-item>
				
				<el-form-item>
					<el-button type="success" @click="search()">搜索</el-button>
				</el-form-item>
			</el-form>
		</div>
		<div id="search_result">
			<el-table
				:data="departments"
				:border="true"
				:stripe="true">
				<el-table-column label="部门编号" prop="department.dep_id"></el-table-column>
				<el-table-column label="部门名称" prop="department.dep_name"></el-table-column>
				<el-table-column label="部门经理" prop="department.dep_manager"></el-table-column>
				<el-table-column label="部门电话" prop="department.dep_phone"></el-table-column>
				<el-table-column label="部门描述" prop="department.dep_description"></el-table-column>
				<el-table-column label="建立日期" prop="department.dep_date"></el-table-column>
			</el-table>
		</div>
	</div>
</template>

<script>
	export default{
		name:"DepartmentSearchView",
		data(){
			return{
				department:{
					dep_id:'',
					dep_name:'',
					dep_manager:'',
					dep_phone:'',
					dep_description:'',
					dep_date:'',		
				},
				departments:[]
			}
		},
		methods:{
			search(){
				this.$axios.post("http://localhost:8088/eStaff/department/findByParam",this.department)
				.then(rst=>{
					//console.log(rst.data)
					this.departments=rst.data.rst;
				}).catch(err=>{
					console.log(err)
				})
			}
		}
	}
</script>

<style>
</style>
