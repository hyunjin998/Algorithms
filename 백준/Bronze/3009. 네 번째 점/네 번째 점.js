const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout,
});

const points = [];

readline.on('line', (line) => {
    const [x, y] = line.trim().split(' ').map(Number);
    points.push({ x, y });

    if (points.length === 3) {
        readline.close();
    }
});

readline.on('close', () => {
    const xValues = points.map(point => point.x);
    const yValues = points.map(point => point.y);
    
    const xResult = xValues.find(x => xValues.indexOf(x) === xValues.lastIndexOf(x));
    const yResult = yValues.find(y => yValues.indexOf(y) === yValues.lastIndexOf(y));

    console.log(xResult, yResult);
});