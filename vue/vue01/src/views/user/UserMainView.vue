<template>
	<div id="container">
		<div id="top">
			<div id="logo">
				东软教育
			</div>
			<div id="info">
				欢迎【{{user.userName}}】
					<router-link to="" @click.native="doExit()">注销</router-link>
			</div>
		</div>
		<div id="center">
			<div id="leftMenu">
				<el-menu
					default-active="1"
					:router="true"
					:unique-opened="true">
					<el-sub-menu index="1">
						<template #title>
							<el-icon><User /></el-icon>
							<span>用户信息维护</span>
						</template>
						<el-menu-item index="/userReg">员工入职</el-menu-item>
						<el-menu-item index="/UserChange">员工异动</el-menu-item>
					</el-sub-menu>
					<el-sub-menu index="2">
						<template #title>
							<el-icon><Goods /></el-icon>
							<span>商品维护</span>
						</template>
						<el-menu-item index="/">添加商品</el-menu-item>
						<el-menu-item index="/about">查询商品</el-menu-item>
						<el-menu-item index="/about">查询商品</el-menu-item>
					</el-sub-menu>
					<el-sub-menu index="3">
						<template #title>
							<el-icon><Tickets /></el-icon>
							<span>报表管理</span>
						</template>
						<el-menu-item index="/NewStaff">新聘员工报表</el-menu-item>
						<el-menu-item index="/LeaveStaff">离职员工报表</el-menu-item>
						<el-menu-item index="/ChangDep">部门调动员工报表</el-menu-item>
						<el-menu-item index="/ChangPos">岗位调动员工报表</el-menu-item>
					</el-sub-menu>
				</el-menu>
			</div>
			<div id="rightViews">
				<router-view></router-view>
			</div>
		</div>
		<div id="bottom">
			版权归东软教育所有
		</div>
	</div>
</template>

<script>
	export default {
		name:'UserMainView',
		data(){
			return{
				user:{}
			}
		},
		methods:{
			doExit(){
				sessionStorage.removeItem("user");
				this.$router.push("/userLogin");
			}
		},
		created() {			
			let str=sessionStorage.getItem("user");	
			if(str==null || str=='')
			{
				this.$router.push("/userLogin")
			}else{
				this.user=JSON.parse(str);
			}
			
		}
	}
</script>

<style scoped>
	#container{
		width: 100%;
		height: 100%;
		display: flex;
		flex-direction: column;
	}
	#top{
		width: 100%;
		height: 80px;
		border-bottom: 1px solid darkgray;
		display: flex;
		justify-content: space-between;
		align-items: center;
		padding: 0px 20px;
		box-sizing: border-box;
	}
	#top #logo{
		font-size: 50px;
		font-family: 楷体;
		text-shadow: 5px 5px 5px gray;
		font-style: italic;
		font-weight: bolder;
	}
	#top #info{
		font-size: 12px;
	}
	#top a{
		text-decoration: none;
	}
	#bottom{
		width: 100%;
		height: 30px;
		font-size: 12px;
		border-top: 1px solid darkgray;
		display: flex;
		justify-content: center;
		align-items: center;
	}
	#center{
		width: 100%;
		flex: 1;/*占父容器剩下容量的一份*/
		display: flex;
	}
	#center #leftMenu{
		width: 200px;
		height: 100%;
		border-right: 1px solid darkgray;
	}
		
	#center #rightViews{
		height: 100%;
		flex: 1;
		padding: 20px;
		box-sizing: border-box;
	}
</style>