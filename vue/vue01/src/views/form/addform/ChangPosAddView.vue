<template>
	<div id="container">
		<div id="changposAdd_content">
			<el-form>
				<el-form-item size="large">
					<h1>岗位调动员工报表信息添加</h1>
				</el-form-item>
			</el-form>
			<el-form :label-position="labelPosition" 
						label-width="100px" 
						:model="formLabelAlign" 
						style="max-width: 500px">
				<el-form-item label="部门名称:">
					<el-input placeholder="请输入部门名称..." 
								v-model="changposadd.dep_name"></el-input>
				</el-form-item>
				
				<el-form-item label="原岗位名称:">
					<el-input placeholder="请输入原岗位名称..." 
								v-model="changposadd.old_p_name"></el-input>
				</el-form-item>
				
				<el-form-item label="新岗位名称:">
					<el-input placeholder="请输入新岗位名称..." 
								v-model="changposadd.new_p_name"></el-input>
				</el-form-item>
				
				<el-form-item label="姓名:">
					<el-input placeholder="请输入姓名..." 
								v-model="changposadd.staff_name"></el-input>
				</el-form-item>
				
				<el-form-item label="性别:">
					<el-input placeholder="请输入性别..." 
								v-model="changposadd.staff_sex"></el-input>
				</el-form-item>
				
				<el-form-item label="调动日期:">
					<el-date-picker type="date" 
									value-format="YYYY-MM-DD" 
									v-model="changposadd.p_chang_date"></el-date-picker>
				</el-form-item>
				
				<el-form-item label="调动原因:">
					<el-input maxlength="200" 
								placeholder="请输入..." 
								show-word-limit 
								type="textarea"
								v-model="changposadd.p_chang_reason"></el-input>
				</el-form-item>
				
				<el-form-item>
					<div class="btn">
						<el-button type="primary" @click="doBack()">返回</el-button>
						<el-button type="primary" @click="doAdd()">添加</el-button>
					</div>
						
				</el-form-item>
			</el-form>
		</div>
	</div>
</template>

<script>
	export default {
		name:'ChangPosAdd',
		data(){
			return{
				changposadd:{
					dep_name:'',
					old_p_name:'',
					new_p_name:'',
					staff_name:'',
					staff_sex:'',
					p_chang_date:'',
					p_chang_reason:''
				}
			}
		},
		methods:{
			doBack(){
				this.$router.push("/ChangPos");
			},
			doAdd(){
				this.$axios.post("http://localhost:8088/eStaff/changPos/doAdd",this.changposadd)
				.then(rst=>{
					if(rst.data.code==200){
						this.$alert("添加成功","提示");
					}else {
						this.$alert("添加失败","提示");
					}
					console.log(rst.data);
				}).catch(err=>{
					console.log(err);
				})
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
	
	#changposAdd_content {
		width: 600px;
		height: 550px;
		border-radius: 10px;
		padding: 20px;
		box-sizing: border-box;
		box-shadow: 0px 0px 10px gray;
	}
	
	#changposAdd_content h1 {
		text-align: center;
		width: 100%;
		height: 50px;
	}
	
	#changposAdd_content .btn {
		width: 100%;
		height: 40px;
		text-align: right;
	}
</style>
