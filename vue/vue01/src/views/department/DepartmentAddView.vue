<template>
	<div id="container">
		<div id="add_content">
			<el-form label-width="100px" size="large">

				<el-form-item label="部门编号:">
					<el-input placeholder="" v-model="department.dep_id"></el-input>
				</el-form-item>
				
				<el-form-item label="部门名称:">
					<el-input placeholder="" v-model="department.dep_name"></el-input>
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
					<el-date-picker type="date" v-model="department.dep_date"
						value-format="YYYY-MM-DD"></el-date-picker>
				</el-form-item>
				
				<el-form-item>
					<el-button @click="add()">添加</el-button>
				</el-form-item>
		
			</el-form>
		</div>
	</div>
</template>

<script>
	export default{
		name:"DepartmentAddView",
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
			add(){
				this.$axios.post("http://localhost:8088/eStaff/department/addDepartment",this.department)
				.then(rst=>{
					 if(rst.data.code==200){
						this.$alert("部门添加成功！","提示")
					}else
						this.$alert("部门添加失败！","提示")
					})
			}
		}
	}
</script>

<style>
</style>
