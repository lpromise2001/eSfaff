<template>
	<div id="container">
		<div id="new_up">
			<div>
				<el-form label-width="100px" size="large" :inline="true">
					<el-form-item label="部门名称:">
						<el-input placeholder="请输入部门名称..." style="width: 300px;" v-model="newstaff.dep_name"></el-input>
					</el-form-item>
					<el-form-item label="岗位名称:">
						<el-input placeholder="请输入岗位名称..." style="width: 300px;" v-model="newstaff.p_name"></el-input>
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
						<el-button type="primary">查询</el-button>
						<el-button type="primary">添加</el-button>
					</el-form-item>
					
				</el-form>
			</div>
		</div>
		
		<div id="new_down">
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
				}
			}
		}
		
	}
	
</script>

<style scoped>

</style>
