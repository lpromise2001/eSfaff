<template>
	<div id="container">
		<el-header height="auto" style="padding: 10px;">
			<div id="top">
				<div id="logo">
					东软教育
				</div>
				<div id="info">
					<!-- 				欢迎【{{user.userName}}】
					<router-link to="" @click.native="doExit()">注销</router-link> -->
				</div>
			</div>
			<div class="h-6">
				<el-menu :default-active="activeIndex2" class="el-menu-demo" mode="horizontal"
					background-color="#545c64" text-color="#fff" active-text-color="#ffd04b" @select="handleSelect"
					router>
					<el-menu-item index="/">返回主页面</el-menu-item>
					<el-menu-item index="/foreignLanAdd">添加员工信息</el-menu-item>
				</el-menu>
			</div>
		</el-header>

		<el-container direction="horizontal">
			<el-main>
				<el-row :gutter="20">
					<el-col :span="22" :offset="2">
						<el-form label-width="100px" size="large" label-position='left' :inline="true">
							<el-form-item width="200px">
								<el-input placeholder="支持模糊查询" v-model="foreignLanInfo.staff_no">
									<template #prepend>
										<el-icon>
											<User />
										</el-icon>
										&nbsp;员工编号
									</template>
								</el-input>
							</el-form-item>

							<el-form-item label="语言">
								<el-select v-model="foreignLanInfo.foreign_languages">
									<el-option label="英语" value="英语"></el-option>
									<el-option label="法语" value="法语"></el-option>
									<el-option label="德语" value="德语"></el-option>
									<el-option label="阿拉伯语" value="阿拉伯语"></el-option>
								</el-select>
							</el-form-item>

							<el-form-item label="熟练程度">
								<el-select v-model="foreignLanInfo.foreign_languages">
									<el-option label="完全不懂" value="0"></el-option>
									<el-option label="少量，不能进行业务沟通" value="1"></el-option>
									<el-option label="有限的业务沟通" value="2"></el-option>
									<el-option label="一般，业务沟通仍受少量限制" value="3"></el-option>
									<el-option label="好， 无困难地进行谈判和讲演" value="4"></el-option>
									<el-option label="流利，在商务中自如地运用" value="5"></el-option>
								</el-select>
							</el-form-item>

							<el-form-item>
								<el-button type="primary" @click="search()">搜索</el-button>
							</el-form-item>
						</el-form>
					</el-col>
				</el-row>

				<div id="search_result" v-if="isRouterAlive" style="padding: 10px;">
					<el-table :data="foreignLanInfos" border stripe style="width: 100%" ref="multipleTable"
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

						<el-table-column label="外国语种" prop="foreign_languages" width="100"></el-table-column>

						<el-table-column label="熟练程度" width="200">
							<template #default="scope">
								{{proficiencyFormatter(scope.row.proficiency_in_foreign_languages)}}
							</template>
						</el-table-column>

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

			<div id="bottom">
				版权归东软教育所有
			</div>
		</el-footer>
	</div>
</template>

<script>
	export default {
		name: "ForeignLanSearchView",
		created() {
			this.search();
		},
		data() {
			return {
				foreignLanInfo: {
					staff_no: '',
					foreign_languages: '',
					proficiency_in_foreign_languages: 0,
				},
				foreignLanInfos: [],
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
			proficiencyFormatter(proficiency) {
				switch (proficiency) {
					case 0:
						return "完全不懂";
						break;
					case 1:
						return "少量，不能进行业务沟通";
						break;
					case 2:
						return "有限的业务沟通";
						break;
					case 3:
						return "一般，业务沟通仍受少量限制";
						break;
					case 4:
						return "好， 无困难地进行谈判和讲演";
						break;
					case 5:
						return "流利，在商务中自如地运用";
						break;
					default:
						return "其他";
				}
			},
			handleEdit(index, row) {
				this.$message('编辑第' + (index + 1) + '行');
				let str = JSON.stringify(this.foreignLanInfos[index]);
				sessionStorage.setItem("foreignLanInfo", str);
				this.$router.push("/foreignLanInfoUpdate");
			},
			handleDelete(index, row) {
				this.$message.error('删除第' + (index + 1) + '行');
				this.del_list = this.del_list.concat(this.foreignLanInfos[index]);
				console.log(this.del_list);
				this.$axios.post("http://localhost:8088/eStaff/foreignLanInfo/infoDel", this.del_list)
					.then(rst => {
						if (rst.data.code == 200) {
							// this.$message("操作结束");
							this.$alert("操作成功", "成功");
							this.$message.error('删除了' + str);
						} else {
							this.$alert("操作失败", "失败");
						}
						console.log(rst.data);
					}).catch(err => {
						console.log(err);
					})

				this.del_list = [];

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

				this.$axios.post("http://localhost:8088/eStaff/foreignLanInfo/infoDel", this.del_list)
					.then(rst => {
						if (rst.data.code == 200) {
							// this.$message("操作结束");
							this.$alert("操作成功", "成功");
							this.$message.error('删除了' + str);
						} else {
							this.$alert("操作失败", "失败");
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
				let str = JSON.stringify(this.foreignLanInfo)
				console.log(str)
				this.$axios.post("http://localhost:8088/eStaff/foreignLanInfo/findByParam", this.foreignLanInfo)
					.then(rst => {
						console.log(rst.data);
						this.foreignLanInfos = rst.data.result;
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
