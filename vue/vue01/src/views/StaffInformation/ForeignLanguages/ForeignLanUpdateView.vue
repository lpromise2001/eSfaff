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
			<el-form label-position='left'>
				<el-form-item>
					<span>
						<el-icon>
							<User />
						</el-icon>
						员工编号&nbsp;
					</span>
					<el-input disabled v-model="foreignLanInfo.staff_no" size="large"></el-input>
				</el-form-item>
				<el-form-item>
					<span>
						<el-icon>
							<ChatLineSquare />
						</el-icon>
						语言&nbsp;
					</span>
					<el-select v-model="foreignLanInfo.foreign_languages" size="large">
						<el-option label="英语" value="英语"></el-option>
						<el-option label="法语" value="法语"></el-option>
						<el-option label="德语" value="德语"></el-option>
						<el-option label="阿拉伯语" value="阿拉伯语"></el-option>
					</el-select>
				</el-form-item>
				<el-form-item>
					<span>
						<el-icon>
							<Flag />
						</el-icon>
						熟练程度&nbsp;
					</span>
					<el-select v-model="foreignLanInfo.proficiency_in_foreign_languages" size="large">
						<el-option label="完全不懂" value="0"></el-option>
						<el-option label="少量，不能进行业务沟通" value="1"></el-option>
						<el-option label="有限的业务沟通" value="2"></el-option>
						<el-option label="一般，业务沟通仍受少量限制" value="3"></el-option>
						<el-option label="好， 无困难地进行谈判和讲演" value="4"></el-option>
						<el-option label="流利，在商务中自如地运用" value="5"></el-option>
					</el-select>
				</el-form-item>
				<el-form-item>
					<el-button type="primary" size="large" round @click="add()">添加</el-button>
				</el-form-item>
			</el-form>
		</div>
		<div id="bottom">
			版权归东软教育所有
		</div>
	</div>
</template>

<script>
	export default {
		name: 'ForeignLanUpdateView',
		data() {
			return {
				foreignLanInfo: {
					staff_no: '',
					foreign_languages: '',
					proficiency_in_foreign_languages: '',
				},
				foreignLanInfos: []
			}
		},
		created() {
			let str = sessionStorage.getItem("foreignLanInfo");
			if (str == null || str == '') {
				this.$router.push("/foreignLanInfoSearch");
			} else {
				this.foreignLanInfo = JSON.parse(str);
				console.log(this.foreignLanInfo);
			}
		},
		methods: {
			add() {
				//获取页面中控件的值
				let str = JSON.stringify(this.foreignLanInfo);
				console.log(str)
				this.$axios.post("http://localhost:8088/eStaff/foreignLanInfo/infoUpdate", this.foreignLanInfo)
					.then(rst => {
						if (rst.data.code == 200) {
							// this.$message("操作结束");
							this.$alert(rst.data.msg, "成功");
							console.log(rst.data);
							this.$router.push("/foreignLanInfoSearch");
						} else {
							this.$alert(rst.data.msg, "失败");
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
