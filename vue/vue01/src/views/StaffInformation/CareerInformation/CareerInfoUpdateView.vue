<template>
	<div id="container">
		<div id="center">
			<el-form label-width="120px">
				<el-form-item label="员工编号">
					<el-input disabled v-model="CareerInfo.staff_no"></el-input>
				</el-form-item>
				<div>
					<el-form-item label="起止时间">
						<el-col :span="8">
							<el-input type="date" value-format="YYYY-MM-DD" style="width: 200px;" placeholder="开始时间"
								v-model="CareerInfo.start_time"></el-input>
						</el-col>
						<el-col :span="4" style="text-align: center;">
							<span></span>
						</el-col>
						<el-col :span="8">
							<el-input type="date" value-format="YYYY-MM-DD" style="width: 200px;" placeholder="截止时间"
								v-model="CareerInfo.end_time">
							</el-input>
						</el-col>
					</el-form-item>
				</div>
				<el-form-item label="所在单位名称:">
					<el-input v-model="CareerInfo.company_name" placeholder="该阶段从事工作或学习的单位名称"></el-input>
				</el-form-item>
				<el-form-item label="从事工作内容:">
					<el-input v-model="CareerInfo.job_description" placeholder="该阶段从事工作或学习的内容"></el-input>
				</el-form-item>
				<el-form-item label="担任职务:">
					<el-input v-model="CareerInfo.p_name"></el-input>
				</el-form-item>
				<el-form-item label="月薪">
					<el-input-number :precision="2" :step="0.1" v-model="CareerInfo.monthly_salary"></el-input-number>
				</el-form-item>
				<el-form-item label="备注:">
					<el-input v-model="CareerInfo.notes"></el-input>
				</el-form-item>
				<el-form-item>
					<el-button size="large" type="primary" @click="add()">提交修改</el-button>
				</el-form-item>
			</el-form>
		</div>
		<!-- <div id="bottom">
			版权归东软教育所有
		</div> -->
	</div>
</template>

<script>
	export default {
		name: 'CareerInfoAddView',
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
					notes: '无'
				},
				CareerInfos: []
			}
		},
		created() {
			let str = sessionStorage.getItem("CareerInfo");
			if (str == null || str == '') {
				this.$router.push("/CareerInfoSearch");
			} else {
				this.CareerInfo = JSON.parse(str);
				console.log(this.CareerInfo);
			}
		},
		methods: {
			add() {
				//获取页面中控件的值
				let str = JSON.stringify(this.CareerInfo);
				console.log(str)
				this.$axios.post("http://localhost:8088/eStaff/CareerInfo/infoUpdate", this.CareerInfo)
					.then(rst => {
						if (rst.data.code == 200) {
							// this.$message("操作结束");
							this.$alert("操作成功", rst.data.msg);
							console.log(rst.data);
							this.$router.push("/CareerInfoSearch");
						} else {
							this.$alert("操作失败", rst.data.msg);
						}

					}).catch(err => {
						console.log(err);
					})
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
		width: auto;
		flex: 1;
		/*占父容器剩下容量的一份*/
		display: flex;
		padding: 20px;
		box-sizing: border-box;
		justify-content: center;
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
