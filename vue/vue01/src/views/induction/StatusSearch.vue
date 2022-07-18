<template>
	<div id="container">
		<el-form-item>
		<el-button type="primary" size='large' @click="search1()">搜索</el-button>
	</el-form-item>
	<el-form-item>
		<el-button type="primary" size='large' @click="search2()">搜索</el-button>
	</el-form-item>
	</div>
</template>

<script>
	export default{
		name:"StatusSearch",
		data(){
			return{
				staff1:{
					
				},
				users:[]
			}
		},
		methods:{
			search1(){
				this.$axios.post("http://localhost:8088/demo/user/search",this.user)
				.then(rst=>{
					//console.log(rst.data)
					this.users=rst.data.rst;
				}).catch(err=>{
					console.log(err)
				})
			},
			search2(){
				this.$axios.post("http://localhost:8088/demo/user/search",this.user)
				.then(rst=>{
					//console.log(rst.data)
					this.users=rst.data.rst;
				}).catch(err=>{
					console.log(err)
				})
			}
		}
	}
</script>

<style>
</style>