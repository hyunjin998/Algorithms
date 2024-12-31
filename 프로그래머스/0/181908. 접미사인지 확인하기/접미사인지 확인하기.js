function solution(my_string, is_suffix) {
    var answer = 1;
    for(var i=0; i<my_string.length; i++){
        answer = (my_string.substring(i, my_string.length) === is_suffix ? 1 : 0);
        if(answer === 1) return answer;
        answer = 0;
    }
    return answer;
}