const base = {
    get() {
        return {
            url : "http://localhost:8080/shangwuwangzhan/",
            name: "shangwuwangzhan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shangwuwangzhan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "C2C 商务网站"
        } 
    }
}
export default base
