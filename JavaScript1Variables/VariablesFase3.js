            console.log("Anys de traspas de 1948 a 1977");
            var bisesto = 1944;
            for (var i = 0; i < 8; i++){
                bisesto += 4;
                if (bisesto >= 1948 && bisesto <1978 ){
                    console.log(bisesto);
                }
            }
            var any;
            var t = "El vostre any de naixement, es de trapas";
            var f = "El vostre any de naixement, al 1977, no es de trapas";
            if (any = false){
                bisesto = 1977;
                console.log(any + " " + t);
                }else{
                    console.log(any + " " + f);   
                }