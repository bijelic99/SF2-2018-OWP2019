(function(e){function t(t){for(var n,i,s=t[0],c=t[1],l=t[2],p=0,d=[];p<s.length;p++)i=s[p],Object.prototype.hasOwnProperty.call(a,i)&&a[i]&&d.push(a[i][0]),a[i]=0;for(n in c)Object.prototype.hasOwnProperty.call(c,n)&&(e[n]=c[n]);u&&u(t);while(d.length)d.shift()();return o.push.apply(o,l||[]),r()}function r(){for(var e,t=0;t<o.length;t++){for(var r=o[t],n=!0,s=1;s<r.length;s++){var c=r[s];0!==a[c]&&(n=!1)}n&&(o.splice(t--,1),e=i(i.s=r[0]))}return e}var n={},a={app:0},o=[];function i(t){if(n[t])return n[t].exports;var r=n[t]={i:t,l:!1,exports:{}};return e[t].call(r.exports,r,r.exports,i),r.l=!0,r.exports}i.m=e,i.c=n,i.d=function(e,t,r){i.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:r})},i.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},i.t=function(e,t){if(1&t&&(e=i(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var r=Object.create(null);if(i.r(r),Object.defineProperty(r,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var n in e)i.d(r,n,function(t){return e[t]}.bind(null,n));return r},i.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return i.d(t,"a",t),t},i.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},i.p="";var s=window["webpackJsonp"]=window["webpackJsonp"]||[],c=s.push.bind(s);s.push=t,s=s.slice();for(var l=0;l<s.length;l++)t(s[l]);var u=c;o.push([0,"chunk-vendors"]),r()})({0:function(e,t,r){e.exports=r("56d7")},4230:function(e,t,r){},"44f8":function(e,t,r){"use strict";var n=r("90f5"),a=r.n(n);a.a},"56d7":function(e,t,r){"use strict";r.r(t);r("e260"),r("e6cf"),r("cca6"),r("a79d");var n=r("2b0e"),a=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-app",[r("Toolbar"),r("v-content",[r("router-view")],1),r("v-footer",{staticClass:"primary",attrs:{app:"",absolute:"",elevation:24}},[r("v-col",{staticClass:"text-center white--text",attrs:{cols:"12"}},[e._v(" "+e._s((new Date).getFullYear())+" — "),r("strong",[e._v("Dejan Bijelic")])])],1)],1)},o=[],i=(r("a4d3"),r("4de4"),r("caad"),r("e439"),r("dbb4"),r("b64b"),r("2532"),r("159b"),r("96cf"),r("1da1")),s=r("ade3"),c=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("v-app-bar",{staticClass:"pr-12",attrs:{app:"","elevate-on-scroll":"",dark:"",color:"primary"}},[r("v-app-bar-nav-icon",{on:{click:function(t){e.navigationDrawerData.open=!e.navigationDrawerData.open}}}),r("v-toolbar-title",[e._v("Bioskop")]),r("v-spacer"),r("v-menu",{attrs:{right:""},scopedSlots:e._u([{key:"activator",fn:function(t){var n=t.on;return[r("v-btn",e._g({attrs:{icon:""}},n),[r("v-icon",[e._v("mdi-dots-vertical")]),e._v("Registruj se ")],1)]}}])},[r("v-card",[r("v-list",[r("v-list-item",[r("v-list-item-content",[r("p",[e._v(" Neke funkcionalnosti aplikacije su nedostupne neulogovanim korisnicima. "),r("br"),e._v("Prijavite se ili registrujte ako vec nemate nalog ")])])],1)],1),r("v-divider"),r("v-card-actions",[r("v-btn",{attrs:{text:""}},[e._v("Login")]),r("v-btn",{attrs:{text:""}},[e._v("Logout")]),r("v-spacer"),r("RegisterDialog")],1)],1)],1)],1),r("v-navigation-drawer",{attrs:{app:""},model:{value:e.navigationDrawerData.open,callback:function(t){e.$set(e.navigationDrawerData,"open",t)},expression:"navigationDrawerData.open"}},[r("v-list-item",[r("v-list-item-content",[r("v-list-item-title",{staticClass:"title"},[e._v("Bioskop")])],1)],1),r("v-divider"),r("v-list",{attrs:{dense:"",nav:""}},e._l(e.navigationDrawerData.items,(function(t){return r("v-list-item",{key:t.title,attrs:{href:t.link,link:""}},[r("v-list-item-icon",[r("v-icon",{staticClass:"secondary--text"},[e._v(e._s(t.icon))])],1),r("v-list-item-content",[r("v-list-item-title",{staticClass:"secondary--text"},[e._v(e._s(t.title))])],1)],1)})),1)],1)],1)},l=[],u=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-dialog",{attrs:{fullscreen:"","hide-overlay":"",transition:"dialog-bottom-transition"},scopedSlots:e._u([{key:"activator",fn:function(t){t.on;return[r("v-btn",{attrs:{color:"primary",dark:""},on:{click:e.openDialog}},[e._v("Registruj se")])]}}]),model:{value:e.visible,callback:function(t){e.visible=t},expression:"visible"}},[r("v-card",[r("v-toolbar",{attrs:{dark:"",color:"primary"}},[r("v-btn",{attrs:{icon:"",dark:""},on:{click:function(t){e.visible=!1}}},[r("v-icon",[e._v("mdi-close")])],1),r("v-toolbar-title",[e._v("Registracija")])],1),r("v-list",[r("v-list-item",[r("v-list-item-content",[r("v-form",{ref:"registerForm",model:{value:e.form.valid,callback:function(t){e.$set(e.form,"valid",t)},expression:"form.valid"}},[r("v-text-field",{ref:"registerUsername",attrs:{rules:e.rules.usernameRules,label:"Username"},model:{value:e.form.data.username,callback:function(t){e.$set(e.form.data,"username",t)},expression:"form.data.username"}}),r("v-text-field",{attrs:{rules:e.rules.passwordRules,label:"Password",type:"password"},model:{value:e.form.data.password,callback:function(t){e.$set(e.form.data,"password",t)},expression:"form.data.password"}}),r("v-btn",{staticClass:"mr-4",attrs:{disabled:!e.form.valid,color:"secondary"},on:{click:e.submit}},[e._v("Register")])],1),r("v-snackbar",{attrs:{timeout:e.componentData.snackbarGeneral.timeout,color:"error",dark:""},model:{value:e.form.usernameTaken,callback:function(t){e.$set(e.form,"usernameTaken",t)},expression:"form.usernameTaken"}},[e._v(" Username je zauzet pokusajte sa nekim drugim "),r("v-btn",{attrs:{text:""},on:{click:function(t){e.form.usernameTaken=!1}}},[e._v("Close")])],1),r("v-snackbar",{attrs:{app:"",timeout:e.componentData.snackbarGeneral.timeout,color:"success",dark:""},model:{value:e.componentData.successSnackbar.open,callback:function(t){e.$set(e.componentData.successSnackbar,"open",t)},expression:"componentData.successSnackbar.open"}},[e._v(" Uspesna Registracija "),r("v-btn",{attrs:{text:""},on:{click:function(t){e.componentData.successSnackbar.open=!1}}},[e._v("Close")])],1),r("v-snackbar",{attrs:{timeout:e.componentData.snackbarGeneral.timeout,color:"error",dark:""},model:{value:e.componentData.failSnackbar.open,callback:function(t){e.$set(e.componentData.failSnackbar,"open",t)},expression:"componentData.failSnackbar.open"}},[e._v(" Doslo je do greske "),r("v-btn",{attrs:{text:""},on:{click:function(t){e.componentData.failSnackbar.open=!1}}},[e._v("Close")])],1)],1)],1)],1)],1)],1)},p=[],d=(r("498a"),r("bc3a")),m=r.n(d),f=r("2f62");function v(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function h(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?v(Object(r),!0).forEach((function(t){Object(s["a"])(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):v(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}var b={name:"RegisterDialog",data:function(){return{visible:!1,form:{valid:!0,usernameTaken:!1,data:{username:"",password:""}},rules:{usernameRules:[function(e){return e+"".trim()!==""||"Polje ne sme biti prazno"}],passwordRules:[function(e){return e+"".trim()!==""||"Polje ne sme biti prazno"},function(e){return!((e+"").trim().length<8)||"Sifra mora da ima vise od 8 karaktera"}]},componentData:{snackbarGeneral:{timeout:2e3},successSnackbar:{open:!1},failSnackbar:{open:!1}}}},methods:{openDialog:function(e){e.stopPropagation(),this.visible=!0},submit:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.checkIfUsernameAvailable(this.form.data.username);case 2:if(t=e.sent,1==t){e.next=7;break}this.form.usernameTaken=!0,e.next=18;break;case 7:if(!this.$refs.registerForm.validate()){e.next=18;break}return e.next=10,this.register();case 10:if(e.t0=e.sent,!0!==e.t0){e.next=17;break}this.componentData.successSnackbar.open=!0,this.visible=!1,this.$refs.registerForm.reset(),e.next=18;break;case 17:this.componentData.failSnackbar.open=!0;case 18:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),register:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(){var t,r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=this.form.data,r=!1,e.next=4,m.a.post("".concat(this.getFullServerAddress,"/Bioskop/Register"),t).then((function(e){return r=e.data.successfull})).catch((function(){return r=!1}));case 4:return e.abrupt("return",r);case 5:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),checkIfUsernameAvailable:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(t){var r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return r="",e.next=3,m.a.post("".concat(this.getFullServerAddress,"/Bioskop/UniqueUsername"),{username:t}).then((function(e){r=e.data.available?e.data.available:"Username je zauzet"})).catch((function(){return r="serverski problem"}));case 3:return e.abrupt("return",r);case 4:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}()},computed:h({},Object(f["c"])(["getFullServerAddress"])),watch:{visible:function(){this.visible||(this.$refs.registerForm.reset(),this.form.valid=!1)}}},g=b,j=r("2877"),k=r("6544"),w=r.n(k),y=r("8336"),O=r("b0af"),D=r("169a"),_=r("4bd4"),x=r("132d"),P=r("8860"),C=r("da13"),S=r("5d23"),z=r("2db4"),T=r("8654"),V=r("71d9"),R=r("2a7f"),F=Object(j["a"])(g,u,p,!1,null,null,null),E=F.exports;w()(F,{VBtn:y["a"],VCard:O["a"],VDialog:D["a"],VForm:_["a"],VIcon:x["a"],VList:P["a"],VListItem:C["a"],VListItemContent:S["a"],VSnackbar:z["a"],VTextField:T["a"],VToolbar:V["a"],VToolbarTitle:R["a"]});var A={name:"Toolbar",components:{RegisterDialog:E},data:function(){return{navigationDrawerData:{open:!1,items:[{title:"Pocetna",icon:"mdi-home",link:"/#/"},{title:"Filmovi",icon:"mdi-movie",link:"/#/Filmovi"},{title:"Projekcije",icon:"mdi-movie-roll",link:"/#/"},{title:"Rezervacija Karte",icon:"mdi-ticket",link:"/#/"}]}}},methods:{}},L=A,B=r("40dc"),I=r("5bc1"),U=r("99d9"),$=r("ce7e"),M=r("34c3"),N=r("e449"),G=r("f774"),H=r("2fa4"),q=Object(j["a"])(L,c,l,!1,null,null,null),J=q.exports;function K(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function Z(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?K(Object(r),!0).forEach((function(t){Object(s["a"])(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):K(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}w()(q,{VAppBar:B["a"],VAppBarNavIcon:I["a"],VBtn:y["a"],VCard:O["a"],VCardActions:U["a"],VDivider:$["a"],VIcon:x["a"],VList:P["a"],VListItem:C["a"],VListItemContent:S["a"],VListItemIcon:M["a"],VListItemTitle:S["b"],VMenu:N["a"],VNavigationDrawer:G["a"],VSpacer:H["a"],VToolbarTitle:R["a"]});var W={name:"App",components:{Toolbar:J},data:function(){return{}},methods:Z({},Object(f["b"])(["setCurrentTheme","setCurrentThemeToBase","fetchFilmovi"])),computed:Z({},Object(f["c"])(["getCurrentTheme"]),{currentPath:function(){return this.$route.path}}),watch:{currentPath:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.currentPath.includes("/Film/")){e.next=3;break}return e.next=3,this.setCurrentThemeToBase();case 3:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},mounted:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.fetchFilmovi();case 2:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},Y=W,Q=r("7496"),X=r("62ad"),ee=r("a75b"),te=r("553a"),re=Object(j["a"])(Y,a,o,!1,null,null,null),ne=re.exports;w()(re,{VApp:Q["a"],VCol:X["a"],VContent:ee["a"],VFooter:te["a"]});var ae=r("8c4f"),oe=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-container",[r("v-card",[r("v-card-title",[e._v(" Filmovi "),r("v-spacer"),r("v-tooltip",{attrs:{top:""},scopedSlots:e._u([{key:"activator",fn:function(t){var n=t.on;return[r("v-text-field",e._g({attrs:{"append-icon":"md-search",label:"Pretraga","single-line":"","hide-details":""},model:{value:e.tableData.search,callback:function(t){e.$set(e.tableData,"search",t)},expression:"tableData.search"}},n))]}}])},[r("span",[e._v("Za pretragu trajanja po minutima u opsegu: [pocetak-kraj], za pretragu godina proizvodnje u opsegu: {pocetak-kraj},")])])],1),r("v-data-table",{attrs:{headers:e.tableData.zaglavljaTabele,items:e.allFilmovi,"items-per-page":20,loading:e.tableData.doneLoading,"loading-text":"Loading... Please wait",search:e.tableData.search,"custom-filter":e.customFilterFunction},scopedSlots:e._u([{key:"item.zanrovi",fn:function(t){var n=t.item;return e._l(n.zanrovi,(function(t){return r("v-chip",{key:t.id},[e._v(e._s(t.naziv))])}))}},{key:"item.trajanje",fn:function(t){var r=t.item;return[e._v(e._s((r.trajanje-r.trajanje%60)/60)+" min. "+e._s(r.trajanje%60)+" sek.")]}},{key:"item.detaljnije",fn:function(t){var n=t.item;return[r("router-link",{attrs:{to:"/Film/"+n.id}},[e._v("Detaljnije")])]}}])})],1),r("v-btn",{attrs:{color:"secondary",dark:"",bottom:"",right:"",fab:"",fixed:""}},[r("v-icon",[e._v("mdi-plus")])],1)],1)},ie=[];r("99af"),r("d81d"),r("e25e"),r("ac1f"),r("466d"),r("1276");function se(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function ce(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?se(Object(r),!0).forEach((function(t){Object(s["a"])(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):se(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}var le={name:"Filmovi",data:function(){return{tableData:{doneLoading:!1,search:"",zaglavljaTabele:[{text:"Naziv",value:"naziv"},{text:"Zanrovi",value:"zanrovi"},{text:"Trajanje",value:"trajanje"},{text:"Distributer",value:"distributer"},{text:"Zemlja Porekla",value:"zemljaPorekla"},{text:"Godina Proizvodnje",value:"godinaProizvodnje"},{text:"Detaljnije",value:"detaljnije",sortable:!1}]}}},methods:ce({},Object(f["b"])(["fetchFilmovi"]),{customFilterFunction:function(e,t,r){var n="".concat(r.naziv," ").concat(r.zanrovi.reduce((function(e,t){return e+" "+t.naziv}),"")," ").concat(r.trajanje," ").concat(r.distributer," ").concat(r.zemljaPorekla," ").concat(r.godinaProizvodnje).toUpperCase(),a=t.split(" ");return a.reduce((function(e,a){return/^{\d*-\d*}$/.test(a)?(a=a.match(/\d+/g).map((function(e){return parseInt(e)})),a[0]<a[1]&&(r.godinaProizvodnje>=a[0]&&r.godinaProizvodnje<=a[1]&&e)):/^\[\d*-\d*\]$/.test(a)?(a=a.match(/\d+/g).map((function(e){return parseInt(e)})),a[0]<a[1]&&(r.trajanje/60>=a[0]&&r.trajanje/60<=a[1]&&e)):n.includes(t.toUpperCase())&&e}),!0)}}),computed:Object(f["c"])(["allFilmovi"]),created:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.fetchFilmovi();case 2:this.tableData.doneLoading=!1;case 3:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},ue=le,pe=r("cc20"),de=r("a523"),me=r("8fea"),fe=r("3a2f"),ve=Object(j["a"])(ue,oe,ie,!1,null,null,null),he=ve.exports;w()(ve,{VBtn:y["a"],VCard:O["a"],VCardTitle:U["b"],VChip:pe["a"],VContainer:de["a"],VDataTable:me["a"],VIcon:x["a"],VSpacer:H["a"],VTextField:T["a"],VTooltip:fe["a"]});var be=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("v-container",{staticClass:"fill-height px-0 pt-0",style:{backgroundColor:e.componentData.backgroundColor,color:e.componentData.textColor},attrs:{fluid:""}},[n("v-row",{staticClass:"mx-0"},[n("v-img",{ref:"coverImage",attrs:{"lazy-src":r("963b"),src:e.film.pathDoSlike,position:"center center","aspect-ratio":e.$vuetify.breakpoint.mdAndUp?"3.2":"1",contain:!0}})],1),n("v-row",{staticClass:"mx-1"},[n("v-container",[n("v-row",[n("v-col",{attrs:{cols:"md-8"}},[n("h1",{staticClass:"filmTitle"},[e._v(e._s(e.film.naziv))])]),n("v-col",{attrs:{cols:"md-4","align-self":"end",align:"end"}},[n("v-btn",{staticClass:"secondary"},[e._v("Kupi Kartu")])],1)],1),n("v-row",[n("v-col",{attrs:{cols:"md-15"}},[n("p",[e._v(e._s(e.film.opis))])])],1),n("v-row",[n("v-col",{attrs:{cols:"md-2"}},[e._v("Zanrovi:")]),n("v-col",{attrs:{cols:"md-10"}},e._l(e.film.zanrovi,(function(t){return n("v-chip",{key:t.id,attrs:{color:"secondary"}},[e._v(e._s(t.naziv))])})),1)],1),n("v-row",[n("v-col",{attrs:{cols:"md-2"}},[e._v("Reziser:")]),n("v-col",{attrs:{cols:"md-10"}},[n("p",[e._v(e._s(null!=e.film.reziser?e.film.reziser.naziv:""))])])],1),n("v-row",[n("v-col",{attrs:{cols:"md-2"}},[e._v("Glumci:")]),n("v-col",{attrs:{cols:"md-10"}},[n("p",e._l(e.film.glumci,(function(t){return n("span",{key:t.id},[e._v(e._s((t.id!==e.film.glumci[0].id?", ":"")+t.naziv))])})),0)])],1),n("v-row",[n("v-col",{attrs:{cols:"md-2"}},[e._v("Trajanje:")]),n("v-col",{attrs:{cols:"md-10"}},[n("p",[e._v(e._s((e.film.trajanje-e.film.trajanje%60)/60)+" min. "+e._s(e.film.trajanje%60)+" sek.")])])],1),n("v-row",[n("v-col",{attrs:{cols:"md-2"}},[e._v("Distributer:")]),n("v-col",{attrs:{cols:"md-10"}},[n("p",[e._v(e._s(e.film.distributer))])])],1),n("v-row",[n("v-col",{attrs:{cols:"md-2"}},[e._v("Zemlja porekla:")]),n("v-col",{attrs:{cols:"md-10"}},[n("p",[e._v(e._s(e.film.zemljaPorekla))])])],1),n("v-row",[n("v-col",{attrs:{cols:"md-2"}},[e._v("Godina proizvodnje:")]),n("v-col",{attrs:{cols:"md-10"}},[n("p",[e._v(e._s(e.film.godinaProizvodnje))])])],1)],1)],1),n("v-snackbar",{model:{value:e.componentData.errorSnackbarVisible,callback:function(t){e.$set(e.componentData,"errorSnackbarVisible",t)},expression:"componentData.errorSnackbarVisible"}},[e._v(" "+e._s(e.componentData.errorMassage)+" "),n("v-btn",{attrs:{color:"error",text:""},on:{click:function(t){e.componentData.errorSnackbarVisible=!1}}},[e._v("Close")])],1),n("v-speed-dial",{attrs:{direction:"top",right:!0,bottom:!0,"open-on-hover":!1,left:!1,top:!1,fixed:""},scopedSlots:e._u([{key:"activator",fn:function(){return[n("v-btn",{attrs:{color:"secondary",bottom:"",right:"",fab:""},model:{value:e.speedDialData.speedDialOpen,callback:function(t){e.$set(e.speedDialData,"speedDialOpen",t)},expression:"speedDialData.speedDialOpen"}},[e.speedDialData.speedDialOpen?n("v-icon",[e._v("mdi-close")]):n("v-icon",[e._v("mdi-dots-vertical")])],1)]},proxy:!0}]),model:{value:e.speedDialData.speedDialOpen,callback:function(t){e.$set(e.speedDialData,"speedDialOpen",t)},expression:"speedDialData.speedDialOpen"}},[n("v-btn",{attrs:{fab:"",dark:"",small:"",color:"secondary"}},[n("v-icon",[e._v("mdi-pencil")])],1),n("v-btn",{attrs:{fab:"",dark:"",small:"",color:"secondary"}},[n("v-icon",[e._v("mdi-delete")])],1)],1)],1)},ge=[],je=r("0621"),ke=r.n(je);function we(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function ye(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?we(Object(r),!0).forEach((function(t){Object(s["a"])(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):we(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}var Oe={name:"Film",props:{id:String},data:function(){return{film:{},componentData:{errorMassage:"",errorSnackbarVisible:!1,backgroundColor:"#ffffff",textColor:"#000000"},speedDialData:{speedDialOpen:!1}}},computed:Object(f["c"])(["getFilm","allFilmovi","getCurrentTheme","getBaseTheme"]),methods:ye({},Object(f["b"])(["fetchFilmovi","setCurrentTheme","setCurrentThemeToBase"]),{filmLoad:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.allFilmovi.length;case 2:if(e.t0=e.sent,0!==e.t0){e.next=6;break}return e.next=6,this.fetchFilmovi();case 6:if(!/^\d+$/.test(this.id)){e.next=14;break}return e.next=9,this.getFilm(parseInt(this.id,10));case 9:return this.film=e.sent,e.next=12,this.setColors();case 12:e.next=16;break;case 14:this.componentData.errorMassage="Id nije pravilno unet, nije moguce prikazati film",this.componentData.errorSnackbarVisible=!0;case 16:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),setColors:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(){var t,r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.prev=0,e.next=3,ke.a.from(this.film.pathDoSlike).getPalette().then((function(e){return e}));case 3:t=e.sent,this.componentData.backgroundColor=t.DarkVibrant.hex,this.componentData.textColor=t.DarkVibrant.bodyTextColor,r=this.getCurrentTheme,r.primary=t.DarkVibrant.hex,r.secondary=t.Muted.hex,this.setCurrentTheme(r),e.next=17;break;case 12:e.prev=12,e.t0=e["catch"](0),this.setCurrentThemeToBase(),this.componentData.backgroundColor="#fff",this.componentData.textColor="#000";case 17:case"end":return e.stop()}}),e,this,[[0,12]])})));function t(){return e.apply(this,arguments)}return t}()}),watch:{id:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.filmLoad();case 2:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},mounted:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,this.filmLoad();case 2:console.log(JSON.stringify(this.film));case 3:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},De=Oe,_e=(r("44f8"),r("adda")),xe=r("0fd9"),Pe=r("c73b"),Ce=Object(j["a"])(De,be,ge,!1,null,null,null),Se=Ce.exports;w()(Ce,{VBtn:y["a"],VChip:pe["a"],VCol:X["a"],VContainer:de["a"],VIcon:x["a"],VImg:_e["a"],VRow:xe["a"],VSnackbar:z["a"],VSpeedDial:Pe["a"]});var ze=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-container",{staticClass:"p-reset h-60",attrs:{fluid:""}},[r("MovieCarousel")],1)},Te=[],Ve=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-container",{staticClass:"fill-height p-reset",attrs:{fluid:""}},[r("v-carousel",{staticClass:"fill-height",attrs:{"hide-delimiters":"",height:"100%"}},e._l(e.get5NewestFilms,(function(e){return r("v-carousel-item",{key:e.id,attrs:{src:e.pathDoSlike,link:!0,href:"/#/Film/"+e.id,contain:""}})})),1)],1)},Re=[];function Fe(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function Ee(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?Fe(Object(r),!0).forEach((function(t){Object(s["a"])(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):Fe(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}var Ae={name:"MovieCarousel",computed:Ee({},Object(f["c"])(["get5NewestFilms"])),methods:{}},Le=Ae,Be=(r("d67b"),r("5e66")),Ie=r("3e35"),Ue=Object(j["a"])(Le,Ve,Re,!1,null,null,null),$e=Ue.exports;w()(Ue,{VCarousel:Be["a"],VCarouselItem:Ie["a"],VContainer:de["a"]});var Me={name:"Home",components:{MovieCarousel:$e}},Ne=Me,Ge=(r("cccb"),Object(j["a"])(Ne,ze,Te,!1,null,null,null)),He=Ge.exports;w()(Ge,{VContainer:de["a"]}),n["a"].use(ae["a"]);var qe=[{path:"/",name:"Home",component:He},{path:"/Filmovi",name:"Filmovi",component:he},{path:"/Film/:id",name:"Film",component:Se,props:!0}],Je=new ae["a"]({base:"",routes:qe}),Ke=Je,Ze=(r("fb6a"),r("4e827"),{filmovi:[{id:20,naziv:"Ant-Man and the Wasp",zanrovi:[{id:4,naziv:"Komedija"}],reziser:{id:1,naziv:"Jun Erickson"},glumci:[{id:5,naziv:"Susan Wilkes"},{id:11,naziv:"Lennon Francis"},{id:29,naziv:"Oskar Kirby"},{id:33,naziv:"Ifan Rosas"}],trajanje:7461,distributer:"Dejan Productions",zemljaPorekla:"Pakistan",godinaProizvodnje:1988,opis:"The quiet, Cornish town of London holds a secret.\n\nCuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.\n\nHowever, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.\n\nAn engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.\n\nAt first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.\n\nCan Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it's too late, or will his demise become yet another London legend?",obrisan:!1,pathDoSlike:"https://images-na.ssl-images-amazon.com/images/I/911Gc+MRR1L._RI_.jpg"},{id:4,naziv:"Iron Man 2",zanrovi:[{id:1,naziv:"Deciji"}],reziser:{id:4,naziv:"Letitia Dean"},glumci:[{id:9,naziv:"Kira Fox"},{id:56,naziv:"Kamil Ahmad"},{id:62,naziv:"Reece Salazar"},{id:66,naziv:"Saffron Pratt"}],trajanje:10259,distributer:"Dejan Productions",zemljaPorekla:"Greece",godinaProizvodnje:1945,opis:"The quiet, Cornish town of London holds a secret.\n\nCuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.\n\nHowever, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.\n\nAn engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.\n\nAt first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.\n\nCan Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it's too late, or will his demise become yet another London legend?",obrisan:!1,pathDoSlike:"http://3.bp.blogspot.com/_nD_YgZuOadA/TImT2bkSbAI/AAAAAAAAAPs/CNbDBIZzGfw/s1600/robert-downey-jr-wallpapers_18919_1280x800.jpg"},{id:10,naziv:"Guardians of the Galaxy",zanrovi:[{id:4,naziv:"Komedija"}],reziser:{id:8,naziv:"Eathan Beach"},glumci:[{id:26,naziv:"Lee Doyle"},{id:34,naziv:"Cali Gibson"},{id:49,naziv:"Marisa Steadman"},{id:55,naziv:"Brenda Dowling"},{id:60,naziv:"Rumaisa Jenkins"},{id:63,naziv:"Nyah Peralta"},{id:69,naziv:"Payton Vaughan"}],trajanje:9221,distributer:"Dejan Productions",zemljaPorekla:"Pakistan",godinaProizvodnje:1945,opis:"The quiet, Cornish town of London holds a secret.\n\nCuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.\n\nHowever, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.\n\nAn engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.\n\nAt first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.\n\nCan Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it's too late, or will his demise become yet another London legend?",obrisan:!1,pathDoSlike:"https://images-na.ssl-images-amazon.com/images/I/81b45f09rWL._SL1500_.jpg"}]}),We={allFilmovi:function(e){return e.filmovi},filteredFilmovi:function(e){return function(t){return e.filmovi.filter(t)}},getFilm:function(e){return function(t){return e.filmovi.filter((function(e){return e.id===t}))[0]}},get5NewestFilms:function(e){return e.filmovi.sort((function(e,t){return e.id<t.id?-1:e.id>t.id?1:0})).slice(-5)}},Ye={fetchFilmovi:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(t){var r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return r=t.commit,e.next=3,m.a.get("".concat(ht.getters.getFullServerAddress,"/Bioskop/Filmovi")).then((function(e){return r("setFilmovi",e.data)})).catch((function(e){return console.log(e)}));case 3:case"end":return e.stop()}}),e)})));function t(t){return e.apply(this,arguments)}return t}()},Qe={setFilmovi:function(e,t){return e.filmovi=t}},Xe={state:Ze,getters:We,actions:Ye,mutations:Qe},et=r("f309");n["a"].use(et["a"]);var tt=new et["a"]({theme:{themes:{light:{primary:"#6a2109",secondary:"#6c80a1",accent:"#ff5722",error:"#f44336",warning:"#ffeb3b",info:"#cddc39",success:"#8bc34a"}}}}),rt=tt,nt={baseTheme:{primary:"#6a2109",secondary:"#6c80a1",accent:"#ff5722",error:"#f44336",warning:"#ffeb3b",info:"#cddc39",success:"#8bc34a"},currentTheme:{primary:"#ffc107",secondary:"#ff9800",accent:"#ff5722",error:"#f44336",warning:"#ffeb3b",info:"#cddc39",success:"#8bc34a"}},at={getBaseTheme:function(e){return JSON.parse(JSON.stringify(e.baseTheme))},getCurrentTheme:function(e){return JSON.parse(JSON.stringify(e.currentTheme))}},ot={setCurrentTheme:function(e,t){var r=e.commit;rt.framework.theme.themes.light=t,r("SET_CURRENT_THEME",t)},setCurrentThemeToBase:function(e){var t=e.commit;rt.framework.theme.themes.light=nt.baseTheme,t("SET_CURRENT_THEME",nt.baseTheme)}},it={SET_BASE_THEME:function(e,t){return e.baseTheme=t},SET_CURRENT_THEME:function(e,t){return e.currentTheme=t}},st={state:nt,getters:at,actions:ot,mutations:it},ct={serverAddress:"192.168.1.250",serverPort:"8081"},lt={getServerAddress:function(e){return e.serverAddress},getServerPort:function(e){return e.serverPort},getFullServerAddress:function(e){return"http://".concat(e.serverAddress,":").concat(e.serverPort)}},ut={state:ct,getters:lt},pt={currentUser:{id:0,username:"",password:"",datumRegistracije:new Date,uloga:"Gost",obrisan:!1}},dt={getCurrentUser:function(e){return e.currentUser},getCurrentUserUloga:function(e){return e.currentUser.uloga}},mt={setCurrentUser:function(e,t){var r=e.commit;r("SET_CURRENT_USER",t)},login:function(){var e=Object(i["a"])(regeneratorRuntime.mark((function e(t,r,n){var a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a=t.commit,console.log(a,r,n),e.abrupt("return",!0);case 3:case"end":return e.stop()}}),e)})));function t(t,r,n){return e.apply(this,arguments)}return t}()},ft={SET_CURRENT_USER:function(e,t){return e.currentUser=t}},vt={state:pt,getters:dt,actions:mt,mutations:ft};n["a"].use(f["a"]);var ht=new f["a"].Store({state:{},mutations:{},actions:{},modules:{filmoviModule:Xe,themeModule:st,serverGlobalsModule:ut,currentUserModule:vt}}),bt=r("3003"),gt=r("2b27"),jt=r.n(gt);n["a"].use(jt.a),n["a"].use(bt["a"]),n["a"].config.productionTip=!1,new n["a"]({router:Ke,store:ht,vuetify:rt,render:function(e){return e(ne)}}).$mount("#app")},"90f5":function(e,t,r){},"963b":function(e,t,r){e.exports=r.p+"img/film-poster-placeholder.d1b4253f.png"},cccb:function(e,t,r){"use strict";var n=r("4230"),a=r.n(n);a.a},d67b:function(e,t,r){"use strict";var n=r("dde3"),a=r.n(n);a.a},dde3:function(e,t,r){}});
//# sourceMappingURL=app.29143ec0.js.map