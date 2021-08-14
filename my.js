var canvas= document.querySelector('canvas');
canvas.width=window.innerWidth;
canvas.height= window.innerHeight;
var c= canvas.getContext('2d');

var mouse ={
  x:undefined,
  y:undefined
}
window.addEventListener('mousemove',function(event){
mouse.x = event.x;
mouse.y= event.y;
//this.console.log(mouse);
})
var colorarray=[
  'pink','blue','red','purple'
]

 function Circle(x,y,dx,dy,radius){
  this.x=x;
  this.y=y;
  this.dx=dx;
  this.dy=dy;
  this.radius=radius;
  this.color=colorarray[Math.floor(Math.random() * colorarray.length)];
  this.draw=function(){
c.beginPath();
c.arc(this.x,this.y,this.radius,0,Math.PI*2 ,false);
c.strokeStyle="purple";
c.fillStyle=this.color;
c.fill();
// c.stroke();

  }
  this.update = function(){
    if(this.x + this.radius > innerWidth || this.x-this.radius<0){
      this.dx= -this.dx;

    }
    if(this.y+this.radius>innerWidth|| this.y-this.radius<0){
      this.dy=-this.dy;
    }
    this.x+=this.dx;
    this.y+=this.dy;
    //interactive part
    if(mouse.x- this.x<20 && mouse.x-this.x>-20 && mouse.y - this.y<20 && mouse.y-this.y>-20)
    {
      this.radius +=1;
    }
    else if(this.radius>10){ 
      this.radius -=1;
    }
    this.draw();
  }
}
var circlearray=[];
for(var i=0; i<100 ; i++)
{
  var x= Math.random() * window.innerWidth;
  var y =Math.random()* window.innerHeight;
  var dx=(Math.random()-0.5);
  var dy=(Math.random()-0.5);
  var radius=15;
  circlearray.push(new Circle(x,y,dx,dy,radius));
}


function animate(){
  requestAnimationFrame(animate);
  c.clearRect(0,0,innerWidth,innerHeight);
for(var i=0;i< circlearray.length ;i++)
{
circlearray[i].update();
}

}
animate();
