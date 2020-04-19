import request from '@/utils/request'

export function login(param){
    return request({
        url: 'http://localhost:8888/login',
        method: 'get',
        params: param
    })
}