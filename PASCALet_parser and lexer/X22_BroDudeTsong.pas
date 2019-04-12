program Hello;

var a,b,c:float;
var d,e:integer;
var f:character;
var g:string;

{test area function}
function compute_area(x:integer;y:integer):integer;
begin
    compute_area:=1*2*3;
end;

{test void function}
procedure Void(area, length: integer; test: string);

var b:float;
var a,d:integer;
var f:character;
var g:string;hi

begin
	a:=100*2;
	b:=a+100;
	writeln('initialized a and b: ',a,b);
	write('dapat di magenter');
	writeln('input a and b');
	readln(a,b);
	c:=1;
	a:=a+1;
	b:=c+1;
	writeln('newer a and b: ',a,b);
	f:='s';
	writeln('f: ',f);
	readln(f);
	writeln('new f: ',f);
end;

{Procedure notvoid(area, length: integer; test: string);}

{main}
begin
    area:=69;
	readln(area);
end.