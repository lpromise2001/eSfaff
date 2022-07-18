<template>
	<div id="container">
		<div id="new_up">
			<div>
				<el-form label-width="100px" size="large" :inline="true">
					<el-form-item label="部门名称:">
						<el-input placeholder="请输入部门名称..." 
									style="width: 300px;" 
									v-model="newstaff.dep_name"></el-input>
					</el-form-item>
					<el-form-item label="岗位名称:">
						<el-input placeholder="请输入岗位名称..." 
									style="width: 300px;" 
									v-model="newstaff.p_name"></el-input>
					</el-form-item>
				</el-form>
			</div>
			<div>
				<el-form label-width="100px" size="large" :inline="true">
					<el-form-item label="姓名:">
						<el-input placeholder="请输入姓名..." style="width: 300px;" v-model="newstaff.staff_name"></el-input>
					</el-form-item>
					<el-form-item label="性别:">
						<el-input placeholder="请输入性别..." style="width: 300px;" v-model="newstaff.staff_sex"></el-input>
					</el-form-item>
				</el-form>
			</div>
			<div>
			    <el-form label-width="100px" size="large">
					<el-form-item label="入职日期:">
						<el-col :span="6">
							<el-date-picker type="date" 
											value-format="YYYY-MM-DD" 
											style="width: 300px;"
											v-model="newstaff.entry_date_start"></el-date-picker>
						</el-col>
						<el-col :span="2">
							<span>------</span>
						</el-col>
						<el-col :span="6">
							<el-date-picker type="date" 
											value-format="YYYY-MM-DD" 
											style="width: 300px;"
											v-model="newstaff.entry_date_end"></el-date-picker>
						</el-col>
					</el-form-item>
				</el-form>
			</div>
			<div>
				<el-form label-width="100px" size="large">
					<el-form-item label="学历:">
						<el-input placeholder="请输入学历..." style="width: 300px;" v-model="newstaff.staff_education"></el-input>
					</el-form-item>
					<el-form-item>
						<el-button type="primary" @click="doFind()">查询</el-button>
						<el-button type="primary" @click="doAdd()">添加</el-button>
					</el-form-item>
					
				</el-form>
			</div>
		</div>
		
		<div id="new_down">
			<el-table :data="newstaffs" :border="true" :stripe="true">
				<el-table-column label="序号" prop="num" fixed='left' style="width: 120px;"></el-table-column>
				<el-table-column label="部门名称" prop="dep_name"></el-table-column>
				<el-table-column label="岗位名称" prop="p_name"></el-table-column>
				<el-table-column label="姓名" prop="staff_name"></el-table-column>
				<el-table-column label="性别" prop="staff_sex"></el-table-column>
				<el-table-column label="入职日期" prop="entry_date"></el-table-column>
				<el-table-column label="学历" prop="staff_education"></el-table-column>
				<el-table-column label="选项" fixed='right' style="width: 120px;">
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
		name:'NewStaffView',
		data(){
			return {
				newstaff:{
					dep_name:'',
					p_name:'',
					staff_name:'',
					staff_sex:'',
					entry_date_start:'',
					entry_date_end:'',
					staff_education:''
				},
				newstaffs:[]
			}
		},
		methods:{
			doAdd(){
				this.$router.push("/NewStaffAdd");
			},
			doFind(){
				this.$axios.post("http://localhost:8088/eStaff/newStaff/findByParam",this.newstaff)
				.then(rst=>{
					console.log(rst.data)
					this.newstaffs=rst.data.result;
				}).catch(err=>{
					console.log(err)
				})
			}
		}
		
	}
	
</script>

<style scoped>

</style>
