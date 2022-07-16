<template>
	<div id="container">
		<el-form label-width="120px">
			<el-form-item label="登录名:">
				<el-input placeholder="输入登录名称" v-model="user.userName"></el-input>
			</el-form-item>
			<el-form-item label="登录密码:">
				<el-input type="password" v-model="user.userPwd"></el-input>
			</el-form-item>
			<el-form-item label="确认密码:">
				<el-input type="password" v-model="rePwd"></el-input>
			</el-form-item>
			<el-form-item label="性别:">
				<el-radio-group v-model="user.userSex">
					<el-radio label="1">男</el-radio>
					<el-radio label="2">女</el-radio>
				</el-radio-group>
			</el-form-item>
			<el-form-item label="学历:">
				<el-select v-model="user.userXl">
					<el-option label="本科" value="1"></el-option>
					<el-option label="专科" value="2"></el-option>
					<el-option label="本科以上" value="3"></el-option>
				</el-select>
			</el-form-item>
			<el-form-item label="生日:">
				<el-date-picker type="date" v-model="user.userBirthday"
					value-format="YYYY-MM-DD"></el-date-picker>
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
				user:{
					userName:'',
					userPwd:'',
					userSex:'1',
					userXl:'',
					userBirthday:''
				},
				rePwd:''
			}
		},
		methods:{
			add(){
				
				this.$axios.post("http://localhost:8088/demo/user/reg",this.user)
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