<template>
    <div align="center" style="background-color: aquamarine">
        <el-form>

            <h3 class="title">登陆</h3>

            <el-form-item prop="username">
                <el-input style="width:20%;" v-model="loginForm.username" prefix-icon="el-icon-user"/>
            </el-form-item>

            <el-form-item prop="password">
                <el-input type="password" style="width:20%;" v-model="loginForm.password" prefix-icon="el-icon-lock"/>
            </el-form-item>

            <el-form-item>
                <el-button type="primary" style="width:20%;"  @click.native.prevent="handleLogin">登录</el-button>
            </el-form-item>

        </el-form>
    </div>
</template>

<script>
    import login from '@/api/login'
    export default {
        data() {
            return {
                loginForm: {
                    username: '',
                    password: '',
                }
            }
        },
        methods: {
            handleLogin() {
                var that = this;
                login(that.loginForm).then(res=>{
                    console.log(res);
                }).catch(err=>{
                    console.log(err);
                });
            }
        }
    }
</script>

<style scoped>

</style>