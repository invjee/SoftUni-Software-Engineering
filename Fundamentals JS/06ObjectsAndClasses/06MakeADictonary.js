function dictionaryMake(input){
let dict = {}
    for(let line of input){
        let obj = JSON.parse(line)
        dict = Object.assign(dict, obj)
    //    dict[Object.keys(obj)]=Object.values(obj)               
    }
    Object.entries(dict).sort((a,b)=>a[0].localeCompare(b[0]))
    .forEach(element => {
        console.log(`Term: ${element[0]} => Definition: ${element[1]}`)
        
    });

 

}
dictionaryMake([
    '{"Coffee":"A hot drink made from the roasted and ground seeds (coffee beans) of a tropical shrub."}',
    '{"Coffee":"New line."}',
    '{"Bus":"A large motor vehicle carrying passengers by road, typically one serving the public on a fixed route and for a fare."}',
    '{"Boiler":"A fuel-burning apparatus or container for heating water."}',
    '{"Tape":"A narrow strip of material, typically used to hold or fasten something."}',
    '{"Microphone":"An instrument for converting sound waves into electrical energy variations which may then be amplified, transmitted, or recorded."}'
    ]
    )