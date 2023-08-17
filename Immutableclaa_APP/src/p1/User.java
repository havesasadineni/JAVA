package p1;
public final class User {
private final String uName,pWord,name,mId;
private final long phNo;
public User(String uName,String pWord,String name,

String mId,long phNo) {
this.uName=uName;
this.pWord=pWord;
this.name=name;
this.mId=mId;
this.phNo=phNo;
}
public final String getuName() {
return uName;
}
public final String getpWord() {
return pWord;
}
public final String getName() {
return name;
}
public final String getmId() {
return mId;
}
public final long getPhNo() {
return phNo;
}
}