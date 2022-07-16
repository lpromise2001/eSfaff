<template>
	<div id="container">
		<el-table :data="users"
			:border="true"
			:stripe="true">
			<el-table-column label="编号" prop="userId"></el-table-column>
			<el-table-column label="姓名" prop="userName"></el-table-column>
			<el-table-column label="性别">
				<template #default="scope">
					{{scope.row.userSex==1?'男':'女'}}
				</template>
			</el-table-column>
			<el-table-column label="邮箱" prop="userEmail"></el-table-column>
		</el-table>
	</div>
</template>

<script>
	export default{
		name:'UsersView',
		data(){
			return{
				users:[
					{
						userId:1,
						userName:'张三',
						userSex:1,
						userEmail:'zhangsan@163.com'
					},
					{
						userId:2,
						userName:'小红',
						userSex:2,
						userEmail:'honghong@163.com'
					},
					{
						userId:3,
						userName:'李四',
						userSex:1,
						userEmail:'lisi@163.com'
					}
				]
			}
		},
		methods:{
			
		}
	}
</script>

<style>
</style>