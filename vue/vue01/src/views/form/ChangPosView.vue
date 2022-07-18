<template>
	<div id="container">
		<div id="pos_up">
			<div>
				<el-form label-width="100px" size="large">
					<el-form-item label="部门名称:">
						<el-input placeholder="请输入部门名称" 
										style="width: 300px;"
										v-model="changpos.dep_name"></el-input>
					</el-form-item>
				</el-form>
			</div>
			<div>
				<el-form label-width="100px" size="large" :inline="true">
					<el-form-item label="原岗位名称:">
						<el-input placeholder="请输入原岗位名称..."
									style="width: 300px;" 
									v-model="changpos.old_p_name"></el-input>
					</el-form-item>
					<el-form-item label="新岗位名称">
						<el-input placeholder="请输入新岗位名称..." 
									style="width: 300px;"
									v-model="changpos.new_p_name"></el-input>
					</el-form-item>
				</el-form>
			</div>
			<div>
				<el-form label-width="100px" size="large" :inline="true">
					<el-form-item label="姓名:">
						<el-input placeholder="请输入姓名..." 
									style="width: 300px;"
									v-model="changpos.staff_name"></el-input>
					</el-form-item>
					<el-form-item label="性别:">
						<el-input placeholder="请输入性别..." 
									style="width: 300px;"
									v-model="changpos.staff_sex"></el-input>
					</el-form-item>
				</el-form>
			</div>
			<div>
			    <el-form label-width="100px" size="large">
					<el-form-item label="调动日期:">
						<el-col :span="6">
							<el-date-picker type="date" 
											value-format="YYYY-MM-DD" 
											style="width: 300px;"
											v-model="changpos.p_chang_date_start"></el-date-picker>
						</el-col>
						<el-col :span="2">
							<span>------</span>
						</el-col>
						<el-col :span="6">
							<el-date-picker type="date" 
											value-format="YYYY-MM-DD" 
											style="width: 300px;"
											v-model="changpos.p_chang_date_end"></el-date-picker>
						</el-col>
					</el-form-item>
				</el-form>
			</div>
			<div>
				<el-form label-width="100px" size="large">
					<el-form-item>
						<el-button type="primary" @click="doFind()">查询</el-button>
						<el-button type="primary" @click="doAdd()">添加</el-button>
					</el-form-item>
				</el-form>
			</div>
		</div>
		
		<div id="pos_down">
			<el-table :data="changposs" :border="true" :stripe="true">
				<el-table-column label="序号" prop="num" fixed="left" style="width: 120px;"></el-table-column>
				<el-table-column label="部门名称" prop="dep_name"></el-table-column>
				<el-table-column label="原岗位名称" prop="old_p_name"></el-table-column>
				<el-table-column label="新岗位名称" prop="new_p_name"></el-table-column>
				<el-table-column label="姓名" prop="staff_name"></el-table-column>
				<el-table-column label="性别" prop="staff_sex"></el-table-column>
				<el-table-column label="调动日期" prop="p_chang_date"></el-table-column>
				<el-table-column label="调动原因" prop="p_chang_reason"></el-table-column>
				<el-table-column label="选项" fixed="right" style="width: 120px;">
					<template #default>
					    <el-button link type="primary" size="small">编辑</el-button>
					    <el-button link type="primary" size="small">删除</el-button>
					</template>
				</el-table-column>
			</el-table>
		</div>
	</div>
</template>

<script>
	
	export default {
		name:'ChangPosView',
		data(){
			return {
				changpos:{
					dep_name:'',
					old_p_name:'',
					new_p_name:'',
					staff_name:'',
					staff_sex:'',
					p_chang_date_start:'',
					p_chang_date_end:''
				},
				changposs:[]
			}
		},
		methods:{
			doAdd(){
				this.$router.push("ChangPosAdd");
			},
			doFind(){
				this.$axios.post("http://localhost:8088/eStaff/changPos/findByParam",this.changpos)
				.then(rst=>{
					console.log(rst.data)
					this.changposs=rst.data.result;
				}).catch(err=>{
					console.log(err)
				})
			}
		}
	}
	
</script>

<style scoped>

</style>
