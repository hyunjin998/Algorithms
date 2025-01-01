const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = '';

readline.on('line', (line) => {
    input = line.trim();
    readline.close();
});

readline.on('close', () => {
    const length = input.length;
    for (let i = 0; i < length; i += 10) {
        console.log(input.substring(i, i + 10));
    }
});