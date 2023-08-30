//> using scala "3.1.3"
//> using lib "net.kogics:kojo-lib:0.1.1,url=https://github.com/litan/kojo-lib/releases/download/v0.1.1/kojo-lib-assembly-0.1.1.jar"

export net.kogics.kojo.Swedish.*, padda.*, CanvasAPI.*, TurtleAPI.*
export builtins.{TurtleAPI as _, CanvasAPI as _, *} 


@main
def gurka() = for i <- 1 to 7 do {
    if i % 2 == 0 then {
        fram; höger(60)
    } 
    else {
        fram; vänster;
    } }