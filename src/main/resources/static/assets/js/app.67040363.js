(function(e){function t(t){for(var a,i,o=t[0],u=t[1],f=t[2],l=0,b=[];l<o.length;l++)i=o[l],Object.prototype.hasOwnProperty.call(r,i)&&r[i]&&b.push(r[i][0]),r[i]=0;for(a in u)Object.prototype.hasOwnProperty.call(u,a)&&(e[a]=u[a]);d&&d(t);while(b.length)b.shift()();return c.push.apply(c,f||[]),n()}function n(){for(var e,t=0;t<c.length;t++){for(var n=c[t],a=!0,o=1;o<n.length;o++){var u=n[o];0!==r[u]&&(a=!1)}a&&(c.splice(t--,1),e=i(i.s=n[0]))}return e}var a={},r={app:0},c=[];function i(t){if(a[t])return a[t].exports;var n=a[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,i),n.l=!0,n.exports}i.m=e,i.c=a,i.d=function(e,t,n){i.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},i.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},i.t=function(e,t){if(1&t&&(e=i(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(i.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var a in e)i.d(n,a,function(t){return e[t]}.bind(null,a));return n},i.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return i.d(t,"a",t),t},i.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},i.p="/";var o=window["webpackJsonp"]=window["webpackJsonp"]||[],u=o.push.bind(o);o.push=t,o=o.slice();for(var f=0;f<o.length;f++)t(o[f]);var d=u;c.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){e.exports=n("56d7")},"09ad":function(e,t,n){"use strict";n("a1b8")},3434:function(e,t,n){"use strict";n("6dd9")},"53e9":function(e,t,n){},"56d7":function(e,t,n){"use strict";n.r(t);n("e260"),n("e6cf"),n("cca6"),n("a79d");var a=n("7a23");function r(e,t,n,r,c,i){var o=Object(a["m"])("MainHeader"),u=Object(a["m"])("MainContents"),f=Object(a["m"])("MainFooter");return Object(a["i"])(),Object(a["d"])(a["a"],null,[Object(a["f"])(o),Object(a["f"])(u),Object(a["f"])(f)],64)}var c=n("f325"),i=n.n(c),o=Object(a["p"])("data-v-6eda90af");Object(a["k"])("data-v-6eda90af");var u={id:"contents"},f={action:"upload",enctype:"multipart/form-data",method:"post",id:"upload"},d=Object(a["f"])("div",{id:"upload-block"},[Object(a["f"])("label",{for:"file",style:{cursor:"pointer"}},[Object(a["f"])("img",{src:i.a})]),Object(a["f"])("input",{type:"file",name:"files",value:"",id:"file",style:{display:"none"}})],-1),l={id:"upload-date"},b={id:"range-slider"},p=Object(a["f"])("input",{type:"hidden",value:"",name:"password"},null,-1),s=Object(a["f"])("p",{class:"clearfix submit"},[Object(a["f"])("input",{type:"submit",class:"btn",value:"업로드",id:"submit"})],-1),j=Object(a["f"])("div",{id:"infobox_1"},[Object(a["f"])("div",null,[Object(a["f"])("h1",null,[Object(a["f"])("i",{class:"","aria-hidden":"true"}),Object(a["e"])("완전 무료")]),Object(a["f"])("p",{style:{margin:"0 0 10px"}}),Object(a["f"])("p",{id:"infobox_2"},"파일을 무료로 저장하고 어떤 파일이든 무제한으로 이용할 수 있습니다.")]),Object(a["f"])("div",null,[Object(a["f"])("h1",null,[Object(a["f"])("i",{class:"","aria-hidden":"true"}),Object(a["e"])(" 자동 삭제")]),Object(a["f"])("p",{style:{margin:"0 0 10px"}}),Object(a["f"])("p",{id:"infobox_2"},"걱정마세요, 저장된 파일은 만료 시간이 지나면 자동으로 삭제됩니다.")]),Object(a["f"])("span",{id:"clearfix"})],-1);Object(a["j"])();var O=o((function(e,t,n,r,c,i){var o=Object(a["m"])("Slider");return Object(a["i"])(),Object(a["d"])("div",u,[Object(a["f"])("form",f,[d,Object(a["f"])("div",l,[Object(a["f"])("div",b,[Object(a["f"])("input",{type:"hidden",value:e.value,name:"deleteDay"},null,8,["value"]),Object(a["f"])(o,{modelValue:e.value,"onUpdate:modelValue":t[1]||(t[1]=function(t){return e.value=t}),format:e.format,min:1,max:30},null,8,["modelValue","format"]),p])]),s,j])])})),v=n("a6f0"),m={name:"MainContents",components:{Slider:v["a"]},data:function(){return{value:7,format:function(e){return"".concat(Math.ceil(e),"일")}}},props:{msg:String}};n("09ad"),n("a637");m.render=O,m.__scopeId="data-v-6eda90af";var y=m,h=Object(a["p"])("data-v-23be85e9");Object(a["k"])("data-v-23be85e9");var g={id:"header"},_={href:"/",rel:""},x=Object(a["e"])("파일보관소");Object(a["j"])();var M=h((function(e,t,n,r,c,i){var o=Object(a["m"])("H1");return Object(a["i"])(),Object(a["d"])("div",g,[Object(a["f"])("a",_,[Object(a["f"])(o,null,{default:h((function(){return[x]})),_:1})])])})),w={name:"MainHeader",props:{}};n("b1aa");w.render=M,w.__scopeId="data-v-23be85e9";var S=w,k=Object(a["p"])("data-v-3c352cc4");Object(a["k"])("data-v-3c352cc4");var P={id:"footer"},H=Object(a["e"])("© 파일 보관소 2021 all rights reserved.");Object(a["j"])();var C=k((function(e,t,n,r,c,i){var o=Object(a["m"])("H5");return Object(a["i"])(),Object(a["d"])("div",P,[Object(a["f"])(o,null,{default:k((function(){return[H]})),_:1})])})),F={name:"MainFooter",props:{}};n("5996");F.render=C,F.__scopeId="data-v-3c352cc4";var I=F,V={name:"App",components:{MainContents:y,MainHeader:S,MainFooter:I}};n("3434");V.render=r;var J=V;Object(a["c"])(J).mount("#app")},5996:function(e,t,n){"use strict";n("dfc9")},"6dd9":function(e,t,n){},a1b8:function(e,t,n){},b1aa:function(e,t,n){"use strict";n("53e9")},dfc9:function(e,t,n){},f325:function(e,t,n){e.exports=n.p+"assets/img/upload.e1275613.png"}});
//# sourceMappingURL=app.67040363.js.map