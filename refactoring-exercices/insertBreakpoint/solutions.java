
/*** Solution 1 ***/
private String insertBreakpoints (String originalString, Integer stringLength) {
  String formattedString = originalString;
  Integer chunkNumber = formattedString.length() / breakpoint;

  if (!String.isblank(s) && chunkNumber > 1) {
    List<String> results = new List<String>();
    
    for (Integer i=0; i<num; i++) {
      results.add(originalString.substring(i*breakpoint,Math.Min(originalString.length(),(i+1)*breakpoint)));
    } 
  }

  return String.join(formattedString, '<br/>');;
}

/*** Solution 2 ***/
private String insertBreakpoints (String originalString, Integer stringLength) {
  String formattedString = originalString;
  Integer chunkNumber = formattedString.length() / breakpoint;

  if (!String.isblank(s) && chunkNumber > 1) {
    List<String> splittedString = splitString(originalString, stringLength);
    formattedString = String.join(splittedString, '<br/>');
  }

  return formattedString;
}

private List<String> splitString(String originalString, Integer stringLength) {
  List<String> results = new List<String>();
    
  for (Integer i=0; i<num; i++) {
    results.add(originalString.substring(i*breakpoint,Math.Min(originalString.length(),(i+1)*breakpoint)));
  }

  return results;
}

/*** Solution 3 ***/
private String insertBreakpoints (String originalString, Integer stringLength) {
  if (originalString == null) {
    throw new Exception('Original String cannot be null.');
  }
  
  List<String> splittedString = splitString(originalString, stringLength);
  
  return String.join(splittedString, '<br/>');
}

private List<String> splitString(String originalString, Integer stringLength) {
  List<String> results = new List<String>();
  Integer chuncks = formattedString.length() / breakpoint;
    
  for (Integer i = 0; i < num; i++) {
    Integer startIndex = i * breakpoint;
    Integer endIndex = Math.Min(originalString.length(), (i + 1) * breakpoint);

    results.add(originalString.substring(startIndex, endIndex));
  }

  return results;
}
