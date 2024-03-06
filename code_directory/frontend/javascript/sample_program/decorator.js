let market={
    sample(){
        return 2;
    }
    ,
    samplefun(x){
        alert("calling with "+x);
        return x * this.sample();
    }
}

function decoratorchaching(func){
    let map=new Map();
    return function(x){
        if(map.has(x)){
            return map.get(x);
        }
        let result=func.call(this,x);
        map.set(x,result);
        return result;
    }
}

alert(market.samplefun(2));
market.samplefun=decoratorchaching(market.samplefun);
alert(market.samplefun(3));
alert(market.samplefun(4));
alert(market.samplefun(5));