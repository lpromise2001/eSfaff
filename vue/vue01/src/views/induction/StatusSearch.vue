<template>
	<div id="container">
	<!--<el-button type="primary" size='large' @click="search1()">实习员工查询</el-button>
	<el-button type="primary" size='large' @click="search2()">正式员工查询</el-button>!-->
	<el-form-item label="员工转正:">
		<el-input placeholder="输入要转正员工的员工号" v-model="staff3.staff_no"></el-input>
	</el-form-item>
	
	<el-form-item>
	-----------------------------------------------------------------------
	<el-button type="primary" size='large' @click="search3()">员工转正</el-button>
	<el-button type="primary" size='large' @click="search1()">实习员工查询</el-button>
	<el-button type="primary" size='large' @click="search2()">正式员工查询</el-button>
	-----------------------------------------------------------------------
	</el-form-item>

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
		name:"StatusSearch",
		data(){
			return{
				staff1:{
					p_name:'',
					staff_name:'',
					staff_no:'',
					staff_sex:'',
					staff_phone:'',
					staff_status:'实习',
					staff_department:''
				},
				staff2:{
					p_name:'',
					staff_name:'',
					staff_no:'',
					staff_sex:'',
					staff_phone:'',
					staff_status:'正式',
					staff_department:''
				},
				staff3:{
					p_name:'',
					staff_name:'',
					staff_no:'',
					staff_sex:'',
					staff_phone:'',
					staff_status:'正式',
					staff_department:''
				},
				staffs:[]
			}
		},
		methods:{
			search1(){
				this.$axios.post("http://localhost:8088/eStaff/user/search1",this.staff1)
				.then(rst=>{
					console.log(rst.data)
					this.staffs=rst.data.result;
				}).catch(err=>{
					console.log(err)
				})
			},
			search2(){
				this.$axios.post("http://localhost:8088/eStaff/user/search2",this.staff2)
				.then(rst=>{
					console.log(rst.data)
					this.staffs=rst.data.result;
				}).catch(err=>{
					console.log(err)
				})
			},
			search3(){
				
				this.$axios.post("http://localhost:8088/eStaff/user/search3",this.staff3)
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