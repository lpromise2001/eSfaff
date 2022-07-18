<template>
	<div id="container">
		<el-form label-width="120px">
			<el-form-item label="职位:">
				<el-input placeholder="输入职位"  v-model="staff.p_name"></el-input>
			</el-form-item>
			<el-form-item label="部门:">
				<el-input placeholder="输入部门" v-model="staff.staff_department"></el-input>
			</el-form-item>
			<el-form-item label="工号:">
				<el-input placeholder="输入工号"  v-model="staff.staff_no"></el-input>
			</el-form-item>
			-----------------------------------------------------------------------
			
				<el-button type="primary" @click="change()">确认变更</el-button>
			
			
				<el-button type="primary" @click="find()">查询全部</el-button>
				-----------------------------------------------------------------------
			
		</el-form>
		<div id="search_result">
			<el-table
				:data="staffs"
				:border="true"
				:stripe="true">
				<el-table-column label="职位" prop="p_name"></el-table-column>
				<el-table-column label="姓名" prop="staff_name"></el-table-column>
				<el-table-column label="工号" prop="staff_no"></el-table-column>
				<el-table-column label="性别" prop="staff_sex"></el-table-column>
				<el-table-column label="手机号" prop="staff_phone"></el-table-column>
				<el-table-column label="状态" prop="staff_status"></el-table-column>
				<el-table-column label="部门" prop="staff_department"></el-table-column>
			</el-table>
		</div>
	</div>
	
</template>

<script>
	export default{
		name:'UserChange',
		data(){
			return {
				staff:{
					p_name:'',
					staff_name:'',
					staff_no:'',
					staff_sex:'',
					staff_phone:'',
					staff_status:'',
					staff_department:''
					
				},
				staffs:[]
			}
		},
		methods:{
			change(){
				
				this.$axios.post("http://localhost:8088/eStaff/user/change",this.staff)
				.then(rst=>{
					if(rst.data.code==200){
						//this.$message("操作结束");
						this.$alert("操作成功","提示");
					}else{
						alert("操作失败")
					}
				}).catch(err=>{
					console.log(err);
				})
				
			},
			find(){
				this.$axios.post("http://localhost:8088/eStaff/user/find",this.staff)
				.then(rst=>{
					console.log(rst.data)
					this.staffs=rst.data.result;
				}).catch(err=>{
					console.log(err)
				})
			}
		}
	}
</script>

<style>
</style>