package com.lsl.cymall.base;

import android.content.Context;


import com.lsl.cymall.R;
import com.lsl.cymall.pojo.CartListBeanModel;
import com.lsl.cymall.pojo.GoodsListBeanModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/8/13.
 */

public class Contants {

    /*public static List<Estimate_List> estimate_lists = new ArrayList<Estimate_List>() {
        {
            add(new Estimate_List(R.mipmap.approve_basic_info, "基本信息", false));
         *//*   add(new Estimate_List(R.mipmap.approve_phone,"手机运营商",false));
            add(new Estimate_List(R.mipmap.approve_person,"个人资质",false));*//*
        }
    };


    public static List<BankModel> bankList = new ArrayList<BankModel>() {
        {
            add(new BankModel(1, "工商银行"));
            add(new BankModel(2, "农业银行"));
            add(new BankModel(3, "招商银行"));
            add(new BankModel(4, "建设银行"));
            add(new BankModel(5, "交通银行"));
            add(new BankModel(6, "中信银行"));
            add(new BankModel(7, "北京银行"));
            add(new BankModel(8, "中国银行"));
            add(new BankModel(9, "兴业银行"));
            add(new BankModel(10, "民生银行"));
            add(new BankModel(11, "华夏银行"));
            add(new BankModel(12, "上海浦东发展银行"));
            add(new BankModel(13, "广发银行"));
            add(new BankModel(14, "光大银行"));


        }
    };

*/
    public static List<GoodsListBeanModel> goodsList = new ArrayList<GoodsListBeanModel>() {
        {
            add(new GoodsListBeanModel(1, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(2, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(3, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(4, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(5, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(6, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
        }
    };

    public static List<CartListBeanModel> cartList = new ArrayList<CartListBeanModel>() {
        {
            add(new CartListBeanModel(1, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "5",1, ""));
            add(new CartListBeanModel(2, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "600", 1,""));
            add(new CartListBeanModel(3, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "70",1, ""));
            add(new CartListBeanModel(4, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "800", 1,""));
            add(new CartListBeanModel(5, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "9", 1,""));
            add(new CartListBeanModel(6, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "100",1, ""));
            add(new CartListBeanModel(7, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "40", 1,""));
            add(new CartListBeanModel(8, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "3000",1, ""));
        }
    };
    /*


    public static List<RxBlackList> report_list = new ArrayList<RxBlackList>() {
        {
            add(new RxBlackList(R.mipmap.rx_icon_1, "优化网贷黑名单，降低被拒率", ""));
            add(new RxBlackList(R.mipmap.rx_icon_2, "优化网贷黑名单", "命中网贷黑名单，理论上是无法清楚数据的，命中黑单" +
                    "网贷被拒概率会非常高，若未命中网贷黑名单，需要保" +
                    "持良好的还款习惯和借款频率，避免逾期；若命中黑名单，仍然想申请网贷，建议多申请市场较新、风控调整" +
                    "期的产品，或者使用其他自然人的身份申请贷款。"));
            add(new RxBlackList(R.mipmap.rx_icon_3, "优化手机运营商数据", "运营商数据，是网贷反欺诈最重要的数据依据；个人要" +
                    "维持和养成良好的通话习惯，贷款手机号需进行实名认" +
                    "证；未实名认证手机申请网贷，大多数机构不会批款；" +
                    "近6月内的话费和通话次数，反映个人通话的稳定性，" +
                    "会影响到贷款机构对您的评估；TOP10的通话人是反欺" +
                    "诈的重要指标，频繁通话的人若命中黑名单，将非常不" +
                    "利于机构放款；通话地区若频繁而不稳定，会提升欺诈" +
                    "的可能，不利于您的放款。"));
            add(new RxBlackList(R.mipmap.rx_icon_4, "优化紧急联系人", "申请借贷时，机构会对申请人的紧急联系人进行信用评" +
                    "估，为了不影响通过率，建议不要选择命中风险项的联" +
                    "系人作为您的紧急联系人。"));
            add(new RxBlackList(R.mipmap.rx_icon_5, "优化手机通讯录", "手机通讯录存在命中网贷黑名单，征信有问题的人，或" +
                    "存在大量申请网贷的手机号，将会提升欺诈的可能，不" +
                    "利于您的放款，您需要维护好通讯录。"));
            add(new RxBlackList(R.mipmap.rx_icon_6, "监测网贷黑名单", "根据自己的批款频率，监测网贷黑名单情况，合理定期" +
                    "检查是否命中黑名单和网贷被拒概率，保持信用健康，" +
                    "优化信用（融信网贷黑名单检测，不查询央行征信）"));
        }
    };*/

    public static final List<String> tablayoutTitleList = new ArrayList<String>() {
        {
            add("详情");
            add("评论");
        }
    };
    public static final String userProtocolTitle = "用户协议";

    public static final String userProtocolContent(Context context) {
        return "前言" +
                "\n\t\t欢迎您阅读" + context.getResources().getString(R.string.app_name) + "(下简称\"我们\")  发布的\"用户服务协议\"  (下简称\"本协议\")。  本协议是关于您在使用" + context.getResources().getString(R.string.app_name) + "手机系统软件时，约定您和" + context.getResources().getString(R.string.app_name) + "之间的权利义务关系。自您通过互联网登录" + context.getResources().getString(R.string.app_name) + "并注册成为" + context.getResources().getString(R.string.app_name) + "的用户时成立并生效。自您成为" + context.getResources().getString(R.string.app_name) + "用户之日起，至您按本协议约定的方式通知" + context.getResources().getString(R.string.app_name) + "注销您的用户信息之日止的期间内，本协议约束和限制您与" + context.getResources().getString(R.string.app_name) + "直接的权利义务关系。" +
                "\n\t\t请您在使用" + context.getResources().getString(R.string.app_name) + "前，务必实现认真阅读本协议中的各条款，并在阅读后选择接受本协议。如您拒绝本协议，您将无法使用" + context.getResources().getString(R.string.app_name) + "产品。" +
                "\n\n一、服务内容简介" +
                "\n\t\t" + context.getResources().getString(R.string.app_name) + "系列软件是运用网络存储服务系统，为用户提供远程数据存储等服务。系列产品不断升级更新中，本协议会随产品更新而同步更新。" +
                "\n\n二、用户信息使用及保护" +
                "\n\t\t1.个人信息的获取方式。我们仅在您接受本协议的前提下，且在向您提供服务的过程中获取您的信息。我们只会取到您明确授权同意的信息。以及您的设备信息及使用状況。" +
                "\n\t\t2.为了保护您的利益，以及维护您对我们的信任，我们会使用商业.上专业的技术和其他安全措施，帮助防止您的个人信息丢失或被盗用。" +
                "\n\t\t3.我们只会在以下情况向第三方披露您的个人信息:" +
                "\n\t\t1)获得您的同意，在您完全同意的情况下，我们才会对外披露您的个人信息"+
                "\n\t\t2)法律法规或公权力部门要求。我们可能会根据法院、政府等执法机构或法律法规的要求向其披露您的信息" +
                "\n\t\t3)重大交易。如果我们涉及合并、收购或资产出售等交易，我们会在信息转让或受其他隐私政策约束之前，继续确保其保密性，并对受到影响方进行及时的通知。" +
                "\n\t\t4)保护" + context.getResources().getString(R.string.app_name) + "和其他方利益。我们可能会为了保护" + context.getResources().getString(R.string.app_name) + "、及我们员工、客户、合作伙伴、  和其他公众的合法权利、利益和安全而披露您的信息。" +
                "\n\n三、免责条款" +
                "\n\t\t" + context.getResources().getString(R.string.app_name) + "是基于互联网为用户提供服务，互联网的不可控性及不稳定性，都是我们无法预知的。故在发生以下情况是,  " + context.getResources().getString(R.string.app_name) + "应免除相应责任:" +

                "\n\t\t1." + context.getResources().getString(R.string.app_name) + "不就通信系统或者互联网的中断或无法运作、  技术故障、计算机错误或病毒、  信息损坏或丢失，或其他在公司合理可控范围之外的原因而产生的其他任何性质的破坏而向用户承担赔偿责任。" +
                "\n\t\t2." + context.getResources().getString(R.string.app_name) + "不保证用户在操作时不会中断或者没有错误，故基于现在" + context.getResources().getString(R.string.app_name) + "的技术体系及条件，不保证可以满足所有用户的需求。" +

                "\n\t\t3.用户明确同意其使用" + context.getResources().getString(R.string.app_name) + "产品所存在的风险将完全由自己承担，因其使用本服务而产生的一切后果也由其自己承担，现金超人不对用户承担任何责任。" +

                "\n\t\t4.在适用的法律允许的范围内，" + context.getResources().getString(R.string.app_name) + "均无须就用户个人信息的丢失和损坏及任何间接的、特殊的、附带的后果性的损失向用户进行赔偿。" +

                "\n\t\t5.如遇到网络系统发生故障，影响到用户的正常使用，我们会及时处理进行修复，但用户因此而产生的经济损失，" + context.getResources().getString(R.string.app_name) + "不承担责任。  此外，我们保留不经事先通知为维修保养，升级或其他任何部分服务的权利。" +
                "\n\n四、违约" +

                "\n\t\t1.用户在使用" + context.getResources().getString(R.string.app_name) + "时，应严格遵守本协议的约定。若用户有任何违反本协议或相关法规的规定，" + context.getResources().getString(R.string.app_name) + "有权视用户的行为性质，在不事先通知用户的情况下，采取包括但不限于中断使用许可、限制使用、  中止或终止服务、追究法律责任等措施，若因此造成" + context.getResources().getString(R.string.app_name) + "或他人损失的，用户应予赔偿。" +
                "\n\n五、知识产权保护说明" +

                "\n\t\t1." + context.getResources().getString(R.string.app_name) + "上所有内容的知识产权均由" + context.getResources().getString(R.string.app_name) + "及其权利人依法拥有，包括但不限于文本、数据、文章、图片、资讯、平台架构、  网页设计等。未经" + context.getResources().getString(R.string.app_name) + "或其权利人书面同意，任何人不得擅自使用、修改、复制、  公开发布现金超人程序或内容。" +
                "" +
                "\n\t\t2.尊重知识产权是用户应尽的义务，如有违反，用户应对" + context.getResources().getString(R.string.app_name) + "承担损害赔偿等法律责任。" +
                "\n\n六、法律适用说明" +
                "\n\t\t1.本协议由用户与" + context.getResources().getString(R.string.app_name) + "共同签订，适用于用户在" + context.getResources().getString(R.string.app_name) + "的一切活动。  协议内容包括但不限于协议正文条款，已发布的或将来可能发布的各类规则，都应视为协议不可分割的一部分，与协议正文条款享有同等法律效力。" +

                "\n\t\t2.本协议不涉及" + context.getResources().getString(R.string.app_name) + "用户间产生的法律关系及法律纠纷。但用户应同意全面接受" + context.getResources().getString(R.string.app_name) + "与其他用户签订的任何协议，并承诺按照该协议承担相应的责任和义务。用户间的纠纷及争议需要" + context.getResources().getString(R.string.app_name) + "提供相应资料时，" + context.getResources().getString(R.string.app_name) + "仅接受来自司法机关的请求。3.  " + context.getResources().getString(R.string.app_name) + "对本协议具有最终解释权" +

                "\n\t\t4.本协议签订地为中国北京市。因本协议所弓|起的用户与" + context.getResources().getString(R.string.app_name) + "的任何纠纷及争议，各方一致同意，不论争议金额大小，均提交伤害仲裁委员会适用伤害仲裁委员会仲裁规则项下的简易程序进行仲裁。仲裁裁决为终局裁决，对双方均具有约束力。" +
                "\n\n七、其他附加条款" +
                "\n\t\t1.产品费率仅供参考，实际费率以借款过程中出借方的具体说明为准" +
                "\n\t\t2." + context.getResources().getString(R.string.app_name) + "是借款产品展示平台，具体借款系由实际资金出借方提供，因借款事宜产生的法律纠纷，与" + context.getResources().getString(R.string.app_name) + "产品无关，" + context.getResources().getString(R.string.app_name) + "运营主体无需承担赔偿责任。";
    }

    public static final String getAboutMe(Context context){
        return "" + context.getResources().getString(R.string.app_name) + "是一款小额借款、贷款、借钱、信用卡办理服务机构，数千个贷款产品可供选择。\n" +
                "[操作简单，快速借款]\n" +
                "贷款操作简单，批款快，审核通过可当天放款!现金贷款产品的搜索，帮助您迅速找到合适、高质量的贷款服务!\n" +
                "[批量申请，成功率高]\n" +
                "多家主流贷款机构贷款产品，大数据批量匹配适合你的贷款，批量申请，成功率.更高，申请额度更大，满足你的各种贷款需求!\n" +
                "[贷后管理，还款提醒]\n" +
                "贷款申请后随时查询审核状态、放款额度、还款期限等信息，及时还款，提高征信度!";
    }

    public static final String getService(Context context){
        return "客服热线: 010- -56258635";
    }

    public static final String rxReprot(Context context){
        return "本授权协议  (简称本协议)是由本平台和您签订。如您选择点击同意此协议将视为授权本平台向第三方支付/征信I金融机构查询/提交您的信用信息，并将视为已阅读并理解本协议的全部内容。\n" +
                "一、授权条款\n" +
                "(一)您理解并同意，在您注册或使用本平台时，本平台将可能依据《征信业管理条例》及相关法律法规，向第三方支付/征信/金融机构或通过上述机构向其他拥有合法资质的第三方(包括但不限于具有资质的征信机构，运营商及其代理商、关联公司，公安部身份信息查询中心等)合法了解、获取、核实您的信用信息。并同意本平台及.上述机构将查询获取的信息进行保存、整理、加工，并用于评价本人信用情况或核实本人信息的真实性。但法律、法规、监管政策禁止查询的除外。\n" +
                "(二)您理解并同意，在您注册或使用本平台时，本平台将可能依据《征信业管理条例》及相关法律法规，向第三方支付/征信/金融机构提交您在本平台业务中产生的相关信息，包括个人基本信息、信用/提现信息、借款申请信息、借款合同信息以及还款行为信息等，并记录在上述机构建设的个人信用信息数据库中。\n" +
                "(三)与本平台合作的第三方机构包括但不限于支付、征信、金融机构或其他合法机构。 \n" +
                "(四)您在本平台打赏获取的分析报告(包括人品分、设备分析、不良分析、网贷分析等)，  为本平台独家知识产权，其内容为本平台的著作权，仅供您个人参考使用，相关的个人信息均为您授权同意后交由本平台做分析用，请勿泄漏给第三方。上述过程中， 如造成个人信息泄漏，由于本平台已经尽到提醒和防范义务，本平台故概不负责。\n" +
                "二、保密条款\n" +
                "(一)本平台重视对用户隐私的保护。因收集您的信息是出于遵守国家法律法规的规定以及向您提供服务及提升服务质量的目的，本平台对您的信用信息承担保密义务，不会为满足第三方的营销目的而向其出售或出租您的任何信息。\n" +
                "(二)本平台会在下列情况下才将您的个人信用信息与第三方共享:   \n" +
                " 1.事先获得用户的明确授权;\n" +
                "2.某些情况下，只有共享您的信息，才能提供您需要的服务和(或)产品，或处理您与他人的交易纠纷或争议。 \n" +
                "3.某些服务和(或) 产品由本平台的合作伙伴提供或由本平台与合作伙伴共同提供，本平台会与其共享提供服务和(或)产品需要的信息。\n" +
                " 4.本平台与第三方进行联合推广活动，本平台可能与其共享活动过程中产生的、为完成活动所必要的个人信息，如参加活动的中奖名单、中奖人联系方式等，以便第三方能及时向您发放奖品。  \n" +
                "5.为维护本平台和其他本平台用户的合法权益。\n" +
                "6.根据法律规定及合理商业习惯，在本平台计划与其他公司合并或被其收购或进行其他资本市场活动(包括但不限于IPO，债券发行)时，以及其他情形下本平台需要接受来自其他主体的尽职调查时，本平台会把您的信息提供给必要的主体，但本平台会通过和这些主体签署保密协议等方式要求其对您的个人信息采取合理的保密措施。根据有关的法律法规要求;\n" +
                "7.按照相关政府主管部门的要求; \n" +
                "8.由于用户将其用户密码告知他人或与他人共享注册账户与密码，由此导致的任何个人信息的泄漏，或其他非因本平台原因导致用户个人信息的泄露; \n" +
                "9.任何由于黑客攻击、电脑病毒入侵及其他不可抗力事件所导致的用户信息泄露、公开。\n" +
                " 三、用户义务及免责声明\n" +
                "(一)您保证，您所提供的个人信息均为您本人的真实信息，不可为他人的信息或虚假信息，若涉嫌恶意信息作假或盗用他人信息，将可能记入网络征信系统，影响您的征信记录，同时本平台将保留追究您相应法律责任的权利。 \n" +
                "(二)如您所提供的个人信息中的全部或部分信息为他人信息或虚假信息，本平台将有权暂停或终止与您的全部或部分服务协议，由此行为所产生的全部法律责任将由您承担，本平台将不对此承担法律责任。\n";
    }

    public final static String[] titles = {"商品", "详情", "规格参数"};
}
