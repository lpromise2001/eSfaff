<template>
	<div id="container">
		<el-header height="auto" style="padding: 10px;"> </el-header>

		<el-container direction="horizontal">
			<el-main>
				<el-row :gutter="20">
					<!-- <el-col :span="2">
						<el-button link>添加员工信息</el-button>
					</el-col> -->
					<el-col :span="20" :offset="4">
						<el-form label-width="100px" size="large" label-position='left' :inline="true">
							<el-form-item width="200px">
								<el-input placeholder="支持模糊查询" v-model="CareerInfo.staff_no">
									<template #prepend>
										<el-icon>
											<User />
										</el-icon>
										&nbsp;员工编号
									</template>
								</el-input>
							</el-form-item>
							<el-form-item>
								<el-input placeholder="支持模糊查询" v-model="CareerInfo.company_name">
									<template #prepend>
										<el-icon>
											<OfficeBuilding />
										</el-icon>
										&nbsp;公司名称
									</template>
								</el-input>
							</el-form-item>
							<el-form-item>
								<el-input placeholder="支持模糊查询" v-model="CareerInfo.p_name">
									<template #prepend>
										<el-icon>
											<UserFilled />
										</el-icon>
										&nbsp;岗位
									</template>
								</el-input>
							</el-form-item>
							<el-form-item>
								<el-button type="primary" @click="search()">搜索</el-button>
							</el-form-item>
						</el-form>
					</el-col>
				</el-row>
				<div id="search_result" v-if="isRouterAlive" style="padding: 10px;">
					<el-table :data="CareerInfos" border stripe style="width: 100%" ref="multipleTable"
						:default-sort="{ prop: 'staff_no', order: '' }" @selection-change="handleSelectionChange"
						size="large">
						<el-table-column type="selection" width="55" v-if="true" />
						<el-table-column label="员工编号" sortable prop="staff_no" width="120">
							<template #default="scope">
								<div style="display: flex; align-items: center">
									<el-icon>
										<User />
									</el-icon>
									<span style="margin-left: 10px">{{ scope.row.staff_no }}</span>
								</div>
							</template>
						</el-table-column>
						<el-table-column label="起始年月" sortable prop="start_time" width="120"></el-table-column>
						<el-table-column label="截止年月" sortable prop="end_time" width="120"></el-table-column>
						<el-table-column label="所在单位名称" prop="company_name"></el-table-column>
						<el-table-column label="从事工作内容" prop="job_description"></el-table-column>
						<el-table-column label="担任职务" prop="p_name" width="100"></el-table-column>
						<el-table-column label="月薪" sortable prop="monthly_salary" width="100"></el-table-column>
						<el-table-column label="备注" prop="notes" width="100"></el-table-column>
						<el-table-column label="操作" width="150px">
							<template #default="scope">
								<el-button size="small" type="primary" @click="handleEdit(scope.$index, scope.row)">编辑
								</el-button>
								<el-button size="small" type="danger" @click="handleDelete(scope.$index, scope.row)">删除
								</el-button>
							</template>
						</el-table-column>
					</el-table>
				</div>
			</el-main>
		</el-container>

		<el-footer height="auto">
			<el-row :gutter="20">
				<!-- <el-col :span="6" :offset="6"></el-col> -->
				<el-col :span="6" :offset="18">
					<el-button size="large" type="primary" @click="toggleSelection()">清除选中</el-button>
					<el-button size="large" type="primary" icon="delete" class="handle-del mr10" @click="delAll()">批量删除
					</el-button>
				</el-col>
			</el-row>

			<div class="pagination">
				<el-row :gutter="20">
					<el-col :span="4" :offset="10">
						<el-pagination @current-change="handleCurrentChange" layout="prev, pager, next" :total="100"
							background class="mt-4">
						</el-pagination>
					</el-col>
				</el-row>
			</div>

			<!-- <div id="bottom">
				版权归东软教育所有
			</div> -->
		</el-footer>
	</div>
</template>

<script>
	export default {
		name: "CareerInfoSearchView",
		created() {
			this.search();
		},
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
				delCareerInfos: [],
				isRouterAlive: true,
				cur_page: 1,
				del_list: [],
			}
		},
		methods: {
			handleCurrentChange(val) {
				this.cur_page = val;
				this.getData();
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
			},
			formatter(row, column) {
				return row.address;
			},
			filterTag(value, row) {
				return row.tag === value;
			},
			handleEdit(index, row) {
				this.$message('编辑第' + (index + 1) + '行');
				let str = JSON.stringify(this.CareerInfos[index]);
				sessionStorage.setItem("CareerInfo", str);
				this.$router.push("/CareerInfoUpdate");
			},
			handleDelete(index, row) {
				this.$message.error('删除第' + (index + 1) + '行');
				this.del_list = this.del_list.concat(this.CareerInfos[index]);
				console.log(this.del_list);
				this.$axios.post("http://localhost:8088/eStaff/CareerInfo/infoDel", this.del_list)
					.then(rst => {
						if (rst.data.code == 200) {
							// this.$message("操作结束");
							this.$alert(rst.data.msg, "成功");
							this.$message.error('删除了' + str);
						} else {
							this.$alert(rst.data.msg, "失败");
						}
						console.log(rst.data);
					}).catch(err => {
						console.log(err);
					})

				this.del_list = [];

				// 刷新搜索框
				this.search()
			},
			delAll() {
				const length = this.multipleSelection.length;
				let str = '';
				this.del_list = this.del_list.concat(this.multipleSelection);

				// console.log(this.del_list);
				for (let i = 0; i < length; i++) {
					str += this.multipleSelection[i] + ' ';
				}
				str = JSON.stringify(this.multipleSelection);
				console.log(str);

				this.$axios.post("http://localhost:8088/eStaff/CareerInfo/infoDel", this.del_list)
					.then(rst => {
						if (rst.data.code == 200) {
							// this.$message("操作结束");
							this.$alert(rst.data.msg, "成功");
							this.$message.error('删除了' + str);
						} else {
							this.$alert(rst.data.msg, "失败");
						}
						console.log(rst.data);
					}).catch(err => {
						console.log(err);
					})
				// this.$message.error('删除了' + str);

				// 重置选中内容
				this.multipleSelection = [];
				this.del_list = [];
				this.search();
			},
			handleSelectionChange(val) {
				this.multipleSelection = val;
				console.log(this.multipleSelection);
			},
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

	#search_result {
		height: 100%;
		padding: 10px;
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
