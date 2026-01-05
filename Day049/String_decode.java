class Solution {
    public String decodeString(String s) {
        Stack<Integer> nst=new Stack<>();
		Stack<String> sst=new Stack<>();
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9'){
				int num=0;
				while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
					num=num*10+(int)(s.charAt(i)-'0');
					i++;
				}
				i--;
				nst.push(num);
			}else if(ch!=']'){
				sst.push(ch +"");
			}
			else{
				String str="";
				while(!sst.peek().equals("[")){
					str=sst.pop()+str;
				}
				
				sst.pop();
				
				StringBuilder sb=new StringBuilder();
				int rep=nst.pop();
				while(rep>0){
					sb.append(str);
					rep--;
				}
				sst.push(sb.toString());
			}
						
		}
		StringBuilder sb2=new StringBuilder("");
		while(sst.size()>0){
				sb2.insert(0,sst.pop());
		}
		return sb2.toString();
    }
}
