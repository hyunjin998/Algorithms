function solution(my_string) {
    var answer = [];
    const len = my_string.length;
    for(var i=0; i<len; i++){
        answer[i] = my_string.substring(i, len);
    }
    return answer.sort();
}