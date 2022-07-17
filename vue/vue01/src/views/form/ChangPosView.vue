<template>
	<div id="container">
		<div id="pos_up">
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
						<el-button type="primary">查询</el-button>
						<el-button type="primary">添加</el-button>
					</el-form-item>
				</el-form>
			</div>
		</div>
		
		<div id="pos_down">
		</div>
	</div>
</template>

<script>
	
	export default {
		name:'ChangPosView',
		data(){
			return {
				changpos:{
					old_p_name:'',
					new_p_name:'',
					staff_name:'',
					staff_sex:'',
					p_chang_date_start:'',
					p_chang_date_end:''
				}
			}
		}
	}
	
</script>

<style scoped>

</style>
