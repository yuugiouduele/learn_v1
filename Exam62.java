package exam;

import java.util.ArrayList;

public class Exam62 {
	public static void main(String[] args) throws Exception {
		 String lineseparate = System.getProperty("line.separator");
		 StringBuilder builder = new StringBuilder();
		 builder.append("%s 様").append(lineseparate);
		 builder.append(lineseparate);
		 builder.append("この度は格別のご高配を賜り、誠にありがとうございます。");
		 builder.append("さて、このたび、私ども有志により新会社を設立いたし、");
		builder.append("４月５日をもって開業の運びとなりました").append(lineseparate);
		 builder.append("今後皆様のご期待に沿いますよう、社員一同全力を挙げて社業に");
		builder.append("務める所存でございます").append(lineseparate);
		 String mailbody = builder.toString();
		 ArrayList<String> members = new ArrayList<String>();
		 members.add("田中");
		 members.add("吉田");
		 members.add("村田");
		 members.add("秋山");
		 members.add("佐原");
		 ArrayList<String> mailbodyList = new ArrayList<String>();
		 for(String member : members){
		 mailbodyList.add(String.format(mailbody, member));
		 }
		 for(String s : mailbodyList){
		 System.out.println(s);
		 }
		}
}
