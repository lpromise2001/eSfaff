<template>
	<div id="container">
		<div id="dep_up">
			<div>
				<el-form label-width="100px" size="large" :inline="true">
					<el-form-item label="原部门名称:">
						<el-input placeholder="请输入原部门名称..."
									style="width: 300px;" 
									v-model="changdep.old_dep_name"></el-input>
					</el-form-item>
					<el-form-item label="新部门名称">
						<el-input placeholder="请输入新部门名称..." 
									style="width: 300px;"
									v-model="changdep.new_dep_name"></el-input>
					</el-form-item>
				</el-form>
			</div>
			<div>
				<el-form label-width="100px" size="large" :inline="true">
					<el-form-item label="姓名:">
						<el-input placeholder="请输入姓名..." 
									style="width: 300px;"
									v-model="changdep.staff_name"></el-input>
					</el-form-item>
					<el-form-item label="性别:">
						<el-input placeholder="请输入性别..." 
									style="width: 300px;"
									v-model="changdep.staff_sex"></el-input>
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
											v-model="changdep.dep_chang_date_start"></el-date-picker>
						</el-col>
						<el-col :span="2">
							<span>------</span>
						</el-col>
						<el-col :span="6">
							<el-date-picker type="date" 
											value-format="YYYY-MM-DD" 
											style="width: 300px;"
											v-model="changdep.dep_chang_date_end"></el-date-picker>
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
		
		<div id="dep_down">
			<el-table :data="changdeps" :border="true" :stripe="true">
				<el-table-column label="序号" prop="num" fixed="left" style="width: 120px;"></el-table-column>
				<el-table-column label="原部门名称" prop="old_dep_name"></el-table-column>
				<el-table-column label="新部门名称" prop="new_dep_name"></el-table-column>
				<el-table-column label="姓名" prop="staff_name"></el-table-column>
				<el-table-column label="性别" prop="staff_sex"></el-table-column>
				<el-table-column label="调动日期" prop="dep_chang_date"></el-table-column>
				<el-table-column label="调动原因" prop="dep_chang_reason"></el-table-column>
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
		name:'ChangDepView',
		data(){
			return {
				changdep:{
					old_dep_name:'',
					new_dep_name:'',
					staff_name:'',
					staff_sex:'',
					dep_chang_date_start:'',
					dep_chang_date_end:''
				},
				changdeps:[]
			}
		},
		methods:{
			doAdd(){
				this.$router.push("/ChangDepAdd");
			},
			doFind(){
				this.$axios.post("http://localhost:8088/eStaff/changDep/findByParam",this.changdep)
				.then(rst=>{
					console.log(rst.data)
					this.changdeps=rst.data.result;
				}).catch(err=>{
					console.log(err)
				})
			}
		}
	}
	
</script>

<style scoped>

</style>
