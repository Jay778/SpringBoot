package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
//@Async
public class TaskService {
    @Autowired
    private MailService mailService;
    @Scheduled(cron = "0 00 10 * * ?")
    public void proces(){
        mailService.sendMail("16422802@qq.com","学习总结(何杰）","八周的时间过的很快，已经迎来了第一阶段的尾声，为期四个周的开发项目学习也进行到了尾声。在这八周的时间里面，所学习到的无论的关于专业知识上的，还是其他方面的都让自己感受颇多，受益匪浅。在班级一股浓烈的学习氛围之下，自己也感受到了时间的紧迫。\n" +
                "在为期四周的项目开发中，我明白了要想成事，必先学会脚踏实地，一步步来。无论是在开发项目上，还是在完成其他的事情上，永远不要想着走捷径。遇到问题先自己思考，无从下手再找高手帮忙看看，注意他帮你看的思路，别在一旁闲着，看多了自己也会了，不然你一辈子都停留在那种水平，从人身上学到的东西远远比书多的多。解决了一个问题后，要去究根问底去找到问题产生的起因，以防你下次遇到类似的问题再浪费同样的时间。把代码写的漂亮，注释、空行、规范一样不能少，可读性是放在第一位，方便自己也方便别人。\n" +
                "这学期可以说是改变了我很多东西，包括我的生活方式和学习方式，相比以前是进步了很多。也希望自己能保持着这么一个状态，坚定不移地学习下去。\n" +
                "接下来就是为期8周的实训了，希望自己能够在此阶段中更加的努力学习专业知识，也希望自己能够在此能够取得一定的成果。\n");
        System.out.println("111");
    }

}