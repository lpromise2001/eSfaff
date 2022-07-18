<template>
	<div id="container">
		<div id="position_content">
			<el-form>
				<el-form-item>
					<h1>岗位及人员管理</h1>
				</el-form-item>
				<el-form-item label="岗位编号">
					<el-input v-model="position.p_no">
					</el-input>
				</el-form-item>
				<el-form-item label="岗位名称">
					<el-input v-model="position.p_name">
					</el-input>
				</el-form-item>
				<el-form-item label="岗位编制">
					<el-input v-model="position.p_establishment">
					</el-input>
				</el-form-item>
				<el-form-item>
					<div class="right">
						<el-button @click="add()">增加岗位</el-button>
					</div>
					<div class="right">
						<el-button @click="add()">删除岗位</el-button>
					</div>
					<div class="right">
						<el-button @click="add()">修改岗位</el-button>
					</div>
					<div class="right">
						<el-button @click="search()">查询岗位</el-button>
					</div>
				</el-form-item>
			</el-form>
		</div>
		<div id="current_position">
			<el-table
				:data="positions"
				:border="true"
				:stripe="true">
				<el-table-column label="岗位编号" prop="p_no"></el-table-column>
				<el-table-column label="岗位名称" prop="p_name"></el-table-column>
				<el-table-column label="岗位编制" prop="p_establishment"></el-table-column>
			</el-table>
		</div>
	</div>
</template>

<script>
	export default{
		name:'PositionView',
		data() {
			return{
				position:{
					p_no:'',
					p_name:'',
					p_establishment:'',
				},
				positions:[]
			}
		},
		methods:{
			search(){
				this.$axios.post("http://localhost:8088/eStaff/position/findByPos",this.position)
				.then(rst=>{
					this.positions=rst.data.result;
				}).catch(err=>{
					console.log(err)
				})
			}
		},
	}
</script>

<style scoped>
	#container{
		width: 100%;
		height: 100%;
		background-color: seashell;
		display: flex;
		justify-content: flex-start;
		align-items: flex-start;
	}
	#position_content{
		width: 400px;
		height: 300px;
		border-radius: 10px;
		padding: 20px;
		box-sizing: border-box;
		box-shadow: 0px 0px 10px gray;
	}
	#login_content h1{
		text-align: center;
		width: 100%;
		height: 50px;
	}
	#login_content .right{
		width: 100%;
		height: 40px;
		text-align: center;
	}
	#login_content a{
		text-decoration: none;
		margin-right: 20px;
	}
</style>
