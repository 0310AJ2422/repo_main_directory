let numbers={
    a:1,
    b:2,
    c:3,
    d:4,
    e:5,
    f:6,

    [Symbol.iterator](){
        const keys=Object.keys(this);
        let index=0;
        return{
            next:()=>{
                if(index<keys.length){
                    const key=keys[index++]
                    return {value:{key,value:this[key]},done:false}
                }else{
                    return {done:true}
                }
                
            }
        }
    }
};

for(let val of numbers){
    console.log(val);
}