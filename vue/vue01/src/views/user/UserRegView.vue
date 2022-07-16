<template>
	<div id="container">
		<el-form label-width="120px">
			<el-form-item label="职位:">
				<el-input placeholder="输入职位" v-model="staff.p_name"></el-input>
			</el-form-item>
			<el-form-item label="姓名:">
				<el-input placeholder="输入职位" v-model="staff.staff_name"></el-input>
			</el-form-item>
			<el-form-item label="编号:">
				<el-input placeholder="输入职位" v-model="staff.staff_no"></el-input>
			</el-form-item>
			<el-form-item label="性别:">
				<el-input placeholder="输入职位" v-model="staff.staff_sex"></el-input>
			</el-form-item>
			<el-form-item label="手机号:">
				<el-input placeholder="输入职位" v-model="staff.staff_phone"></el-input>
			</el-form-item>
			<el-form-item>
				<el-button type="info" @click="add()">添加</el-button>
			</el-form-item>
		</el-form>
	</div>
</template>

<script>
	export default{
		name:'UserRegView',
		data(){
			return {
				staff:{
					p_name:'',
					staff_name:'',
					staff_no:'1',
					staff_sex:'',
					staff_phone:''
				}
			}
		},
		methods:{
			add(){
				
				this.$axios.post("http://localhost:8088/eStaff/user/reg",this.staff)
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
				
			}
		}
	}
</script>

<style>
</style>