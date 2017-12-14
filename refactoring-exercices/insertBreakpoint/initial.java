private String insBr(String s, Integer breakpoint){
  if(String.isblank(s)){
    return s;
  }else{
    Integer num = s.length()/breakpoint;
    if(num ==0 || s.length() == breakpoint){
      return s;
    } else {
      String[] results=new List<String>();
      
      for (Integer i=0; i<num;i++){
        results.add(s.substring(i*breakpoint,Math.Min(s.length(),(i+1)*breakpoint)));
      }
      
      return String.join(results, '<br/>');
    }
  }
}
