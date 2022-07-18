<template>
	<div id="container">
		<div id="newstaffAdd_content">
			<el-form>
				<el-form-item size="large">
					<h1>新聘员工报表信息添加</h1>
				</el-form-item>
			</el-form>
			<el-form :label-position="labelPosition" 
						label-width="100px" 
						:model="formLabelAlign" 
						style="max-width: 500px">
				<el-form-item label="部门名称:">
					<el-input placeholder="请输入部门名称..." 
								v-model="newstaffadd.dep_name"></el-input>
				</el-form-item>
				
				<el-form-item label="岗位名称:">
					<el-input placeholder="请输入岗位名称..." 
								v-model="newstaffadd.p_name"></el-input>
				</el-form-item>
				
				<el-form-item label="姓名:">
					<el-input placeholder="请输入姓名..." 
								v-model="newstaffadd.staff_name"></el-input>
				</el-form-item>
				
				<el-form-item label="性别:">
					<el-input placeholder="请输入性别..." 
								v-model="newstaffadd.staff_sex"></el-input>
				</el-form-item>
				
				<el-form-item label="入职日期:">
					<el-date-picker type="date" 
									value-format="YYYY-MM-DD" 
									v-model="newstaffadd.entry_date"></el-date-picker>
				</el-form-item>
				
				<el-form-item label="学历:">
					<el-select placeholder="请选择" v-model="newstaffadd.staff_education">
						<el-option label="小学" value="1"></el-option>
						<el-option label="初中" value="2"></el-option>
						<el-option label="高中" value="3"></el-option>
						<el-option label="专科" value="4"></el-option>
						<el-option label="本科" value="5"></el-option>
						<el-option label="硕士研究生" value="6"></el-option>
						<el-option label="博士研究生" value="7"></el-option>
					</el-select>
				</el-form-item>
				
				<el-form-item>
					<div class="btn">
						<el-button type="primary" @click="doBack()">返回</el-button>
						<el-button type="primary">添加</el-button>
					</div>
						
				</el-form-item>
			</el-form>
		</div>
	</div>
</template>

<script>
	export default {
		name:'NewStaffAdd',
		data(){
			return{
				newstaffadd:{
					dep_name:'',
					p_name:'',
					staff_name:'',
					staff_sex:'',
					entry_date:'',
					staff_education:''
				}
			}
		},
		methods:{
			doBack(){
				this.$router.push("/NewStaff");
			}
		}
	}
	import { reactive, ref } from 'vue'
	const labelPosition = ref('right')
	const formLabelAlign = reactive({
		name: '',
		region: '',
		type: '',
	})
</script>

<style scoped>
	#container {
		width: 100%;
		height: 100%;
		display: flex;
		justify-content: center;
		align-items: center;
	}
	
	#newstaffAdd_content {
		width: 600px;
		height: 550px;
		border-radius: 10px;
		padding: 20px;
		box-sizing: border-box;
		box-shadow: 0px 0px 10px gray;
	}
	
	#newstaffAdd_content h1 {
		text-align: center;
		width: 100%;
		height: 50px;
	}
	
	#newstaffAdd_content .btn {
		width: 100%;
		height: 40px;
		text-align: right;
	}
</style>
