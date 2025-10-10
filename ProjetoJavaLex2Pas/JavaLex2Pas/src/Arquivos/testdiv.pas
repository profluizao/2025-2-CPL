program testdiv;
var
    v1, v2 : integer ;
begin
    write ('Entre com dois numeros inteiros: ');
    readln (v1, v2);
    writeln ('A expressao ', v1:1, ' / ', v2:1,
    ' vale ', v1 / v2 :1:2 ) ;
    writeln ('A expressao ', v1:1, ' DIV ', v2:1,
    ' vale ', v1 div v2 )
end.