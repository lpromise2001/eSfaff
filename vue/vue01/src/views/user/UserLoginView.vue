<template>
	<div id="container">
		<div id="login_content">
			<el-form size="large">
				<el-form-item >
					<h1>在线日报登录</h1>
				</el-form-item>
				<el-form-item>
					<el-input v-model="user.userName">
						<template #prepend>
							<el-icon><User /></el-icon>
						</template>
					</el-input>
				</el-form-item>
				<el-form-item>
					<el-input type="password" v-model="user.userPwd">
						<template #prepend>
							<el-icon><Lock /></el-icon>
						</template>
					</el-input>
				</el-form-item>
				<el-form-item>
					<div class="right">
						<el-button @click="doLogin()">登录</el-button>
					</div>
				</el-form-item>
				<el-form-item>
					<div class="right">
						<router-link to="">忘记密码</router-link>
						<router-link to="">快速注册</router-link>
					</div>
				</el-form-item>
			</el-form>
		</div>
	</div>
</template>

<script>
	export default{
		name:'UserLoginView',
		data(){
			return{
				user:{
					userName:'',
					userPwd:''
				}
			}
		},
		methods:{
			doLogin(){				
				//使用本地存储存放页面中的数据
				//利用浏览器进行存放，只能存放string类型的数据
				let str=JSON.stringify(this.user);
				sessionStorage.setItem("user",str);
				this.$router.push("/userMain");
			}
		}
	}
</script>

<style scoped>
	#container{
		width: 100%;
		height: 100%;
		background-color: lightcyan;
		display: flex;
		justify-content: center;
		align-items: center;
	}
	#login_content{
		width: 400px;
		height: 350px;
		border-radius: 10px;
		padding: 20px;
		box-sizing: border-box;
		box-shadow: 0px 0px 30px gray;
	}
	#login_content h1{
		text-align: center;
		width: 100%;
		height: 50px;
	}
	#login_content .right{
		width: 100%;
		height: 40px;
		text-align: right;
		padding-right: 10px;
	}
	#login_content a{
		text-decoration: none;
		margin-right: 10px;
	}
</style>