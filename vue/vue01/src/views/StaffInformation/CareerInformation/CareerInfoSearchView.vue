<template>
	<div id="container">
		<div id="top">
			<div id="logo">
				东软教育
			</div>
			<div id="info">
				<!-- 				欢迎【{{user.userName}}】
				<router-link to="" @click.native="doExit()">注销</router-link> -->
			</div>
		</div>
		<div id="center">
			<div id="search_content">
				<el-form label-width="100px" size="large">
					<el-form-item label="员工编号:">
						<el-input placeholder="支持模糊查询" v-model="CareerInfo.staff_no"></el-input>
					</el-form-item>
					<el-form-item label="公司名称">
						<el-input placeholder="支持模糊查询" v-model="CareerInfo.company_name"></el-input>
					</el-form-item>
					<el-form-item label="岗位:">
						<el-input placeholder="支持模糊查询" v-model="CareerInfo.p_name"></el-input>
					</el-form-item>
					<el-form-item>
						<el-button type="primary" @click="search()">搜索</el-button>
					</el-form-item>
				</el-form>
			</div>
			<div id="search_result">
				<el-table :data="CareerInfos" :border="true" :stripe="true" style="width: 100%" ref="multipleTable">
					<el-table-column type="selection" width="55" />
					<el-table-column label="员工编号" prop="staff_no"></el-table-column>
					<el-table-column label="起始年月" prop="start_time"></el-table-column>
					<el-table-column label="截止年月" prop="end_time"></el-table-column>
					<el-table-column label="所在单位名称" prop="company_name"></el-table-column>
					<el-table-column label="从事工作内容" prop="job_description"></el-table-column>
					<el-table-column label="担任职务" prop="p_name"></el-table-column>
					<el-table-column label="月薪">
						<template #default="scope">
							{{scope.row.monthly_salary}}
						</template>
					</el-table-column>
					<el-table-column label="备注" prop="notes"></el-table-column>
				</el-table>
				<el-pagination small background layout="prev, pager, next" :total="50" class="mt-4" />
			</div>
		</div>
		<div id="bottom">
			版权归东软教育所有
		</div>
	</div>
</template>

<script>
	export default {
		name: "CareerInfoSearchView",
		data() {
			return {
				CareerInfo: {
					staff_no: '',
					start_time: '',
					end_time: '',
					company_name: '',
					job_description: '',
					p_name: '',
					monthly_salary: 0,
					notes: ''
				},
				CareerInfos: [],
				multipleSelection: [],
				multipleTableRef: []
			}
		},
		methods: {
			search() {
				let str = JSON.stringify(this.CareerInfo)
				console.log(str)
				this.$axios.post("http://localhost:8088/eStaff/CareerInfo/findByParam", this.CareerInfo)
					.then(rst => {
						console.log(rst.data);
						this.CareerInfos = rst.data.result;
					}).catch(err => {
						console.log(err);
					})
			},
			handleSelectionChange(val) {
				this.multipleSelection.value = val;
			},
			toggleSelection(rows) {
				if (rows) {
					rows.forEach((row) => {
						// TODO: improvement typing when refactor table
						// eslint-disable-next-line @typescript-eslint/ban-ts-comment
						// @ts-expect-error
						this.$refs.multipleTable.toggleRowSelection(row)
					})
				} else {
					this.$refs.multipleTable.clearSelection();
				}
			}
		}
	}
</script>

<style scoped>
	#container {
		width: 100%;
		height: 100%;
		/* 弹性布局 */
		display: flex;
		/* 伸缩方向：列方向 */
		flex-direction: column;
		/* background-image: url("../../assets/image03.jpg"); */
		background-color: aliceblue;
	}

	#top {
		width: 100%;
		height: 80px;
		border-bottom: 1px solid darkgray;
		display: flex;
		justify-content: space-between;
		align-items: center;
		padding: 0px 20px;
		box-sizing: border-box;
	}

	#top #logo {
		font-size: 50px;
		font-family: 楷体;
		text-shadow: 5px 5px 5px gray;
		font-style: italic;
		font-weight: bolder;
	}

	#top #info {
		font-size: 12px;
	}

	#top a {
		text-decoration: none;
	}

	#center {
		width: 100%;
		flex: 1;
		/*占父容器剩下容量的一份*/
		display: flex;
		padding: 20px;
		box-sizing: border-box;
	}
	
	#certer #search-content {
		width: 100%;
		display: flex;
		padding: 20px;
		box-sizing: border-box;
	}

	#bottom {
		width: 100%;
		height: 30px;
		font-size: 12px;
		border-top: 1px solid darkgray;
		display: flex;
		justify-content: center;
		align-items: center;
	}
</style>
