<template>
	<div id="container">
		<div id="changdepAdd_content">
			<el-form>
				<el-form-item size="large">
					<h1>部门调动员工报表信息添加</h1>
				</el-form-item>
			</el-form>
			<el-form :label-position="labelPosition" 
						label-width="100px" 
						:model="formLabelAlign" 
						style="max-width: 500px">
				<el-form-item label="原部门名称:">
					<el-input placeholder="请输入原部门名称..." 
								v-model="changdepadd.old_dep_name"></el-input>
				</el-form-item>
				
				<el-form-item label="新部门名称:">
					<el-input placeholder="请输入新岗位名称..." 
								v-model="changdepadd.new_dep_name"></el-input>
				</el-form-item>
				
				<el-form-item label="姓名:">
					<el-input placeholder="请输入姓名..." 
								v-model="changdepadd.staff_name"></el-input>
				</el-form-item>
				
				<el-form-item label="性别:">
					<el-input placeholder="请输入性别..." 
								v-model="changdepadd.staff_sex"></el-input>
				</el-form-item>
				
				<el-form-item label="调动日期:">
					<el-date-picker type="date" 
									value-format="YYYY-MM-DD" 
									v-model="changdepadd.dep_chang_date"></el-date-picker>
				</el-form-item>
				
				<el-form-item label="调动原因:">
					<el-input maxlength="200" 
								placeholder="请输入..." 
								show-word-limit 
								type="textarea"
								v-model="changdepadd.dep_chang_reason"></el-input>
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
		name:'ChangDepAdd',
		data(){
			return{
				changdepadd:{
					old_dep_name:'',
					new_dep_name:'',
					staff_name:'',
					staff_sex:'',
					dep_chang_date:'',
					dep_chang_reason:''
				}
			}
		},
		methods:{
			doBack(){
				this.$router.push("/ChangDep");
			}
		}
	}
	import { reactive, ref } from 'vue'
	const textarea = ref('')
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
	
	#changdepAdd_content {
		width: 600px;
		height: 550px;
		border-radius: 10px;
		padding: 20px;
		box-sizing: border-box;
		box-shadow: 0px 0px 10px gray;
	}
	
	#changdepAdd_content h1 {
		text-align: center;
		width: 100%;
		height: 50px;
	}
	
	#changdepAdd_content .btn {
		width: 100%;
		height: 40px;
		text-align: right;
	}
</style>
