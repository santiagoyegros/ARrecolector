package com.fpuna.preproceso;

/*
 * To changes this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santirrium
 */

public class WekaWrapperMagnitud {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = WekaWrapperMagnitud.N290d210d0(i);
    return p;
  }
  static double N290d210d0(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 1.8702293770815341) {
    p = WekaWrapperMagnitud.N1d76aeea1(i);
    } else if (((Double) i[9]).doubleValue() > 1.8702293770815341) {
    p = WekaWrapperMagnitud.N7995092a17(i);
    } 
    return p;
  }
  static double N1d76aeea1(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 3;
    } else if (((Double) i[8]).doubleValue() <= 0.06299034688155558) {
    p = WekaWrapperMagnitud.N78dd667e2(i);
    } else if (((Double) i[8]).doubleValue() > 0.06299034688155558) {
    p = WekaWrapperMagnitud.N1df8223011(i);
    } 
    return p;
  }
  static double N78dd667e2(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 9.872186174864428) {
    p = WekaWrapperMagnitud.N10db82ae3(i);
    } else if (((Double) i[0]).doubleValue() > 9.872186174864428) {
    p = WekaWrapperMagnitud.N79ad8b2f10(i);
    } 
    return p;
  }
  static double N10db82ae3(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() <= -0.24662258067314508) {
    p = WekaWrapperMagnitud.N501edcf14(i);
    } else if (((Double) i[10]).doubleValue() > -0.24662258067314508) {
    p = WekaWrapperMagnitud.N6b4a4e186(i);
    } 
    return p;
  }
  static double N501edcf14(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 3;
    } else if (((Double) i[3]).doubleValue() <= 9.740502866483762) {
    p = WekaWrapperMagnitud.N78b729e65(i);
    } else if (((Double) i[3]).doubleValue() > 9.740502866483762) {
      p = 3;
    } 
    return p;
  }
  static double N78b729e65(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 3;
    } else if (((Double) i[8]).doubleValue() <= 0.05551745277382025) {
      p = 3;
    } else if (((Double) i[8]).doubleValue() > 0.05551745277382025) {
      p = 0;
    } 
    return p;
  }
  static double N6b4a4e186(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 6.90625) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 6.90625) {
    p = WekaWrapperMagnitud.N27c86f2d7(i);
    } 
    return p;
  }
  static double N27c86f2d7(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() <= -0.16427433053881618) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() > -0.16427433053881618) {
    p = WekaWrapperMagnitud.N197d6718(i);
    } 
    return p;
  }
  static double N197d6718(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.033832439603715465) {
    p = WekaWrapperMagnitud.N402e37bc9(i);
    } else if (((Double) i[1]).doubleValue() > 0.033832439603715465) {
      p = 0;
    } 
    return p;
  }
  static double N402e37bc9(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 3;
    } else if (((Double) i[11]).doubleValue() <= -0.2782667166070238) {
      p = 3;
    } else if (((Double) i[11]).doubleValue() > -0.2782667166070238) {
      p = 0;
    } 
    return p;
  }
  static double N79ad8b2f10(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 1.2776890723704597) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > 1.2776890723704597) {
      p = 3;
    } 
    return p;
  }
  static double N1df8223011(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 13.20512616227174) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 13.20512616227174) {
    p = WekaWrapperMagnitud.N22635ba012(i);
    } 
    return p;
  }
  static double N22635ba012(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 18.860251156045763) {
    p = WekaWrapperMagnitud.N13c10b8713(i);
    } else if (((Double) i[2]).doubleValue() > 18.860251156045763) {
    p = WekaWrapperMagnitud.N6293abcc16(i);
    } 
    return p;
  }
  static double N13c10b8713(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 1.6390522422501996) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > 1.6390522422501996) {
    p = WekaWrapperMagnitud.N6a01e2314(i);
    } 
    return p;
  }
  static double N6a01e2314(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() <= 9.675918794501648) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() > 9.675918794501648) {
    p = WekaWrapperMagnitud.N5a95556515(i);
    } 
    return p;
  }
  static double N5a95556515(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 1.5857560517780431) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 1.5857560517780431) {
      p = 5;
    } 
    return p;
  }
  static double N6293abcc16(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 11.10686328481219) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() > 11.10686328481219) {
      p = 1;
    } 
    return p;
  }
  static double N7995092a17(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 5;
    } else if (((Double) i[2]).doubleValue() <= 17.85974219492334) {
    p = WekaWrapperMagnitud.N7fc2413d18(i);
    } else if (((Double) i[2]).doubleValue() > 17.85974219492334) {
    p = WekaWrapperMagnitud.N4e91d63f101(i);
    } 
    return p;
  }
  static double N7fc2413d18(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() <= 1.5046666121487373) {
    p = WekaWrapperMagnitud.Nf8c1ddd19(i);
    } else if (((Double) i[8]).doubleValue() > 1.5046666121487373) {
    p = WekaWrapperMagnitud.N3901d13456(i);
    } 
    return p;
  }
  static double Nf8c1ddd19(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 4;
    } else if (((Double) i[3]).doubleValue() <= 9.16304081994083) {
    p = WekaWrapperMagnitud.N70be0a2b20(i);
    } else if (((Double) i[3]).doubleValue() > 9.16304081994083) {
      p = 4;
    } 
    return p;
  }
  static double N70be0a2b20(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 14.79835595960351) {
    p = WekaWrapperMagnitud.N2133814f21(i);
    } else if (((Double) i[2]).doubleValue() > 14.79835595960351) {
    p = WekaWrapperMagnitud.N11a9e7c855(i);
    } 
    return p;
  }
  static double N2133814f21(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 9.949157623799753) {
    p = WekaWrapperMagnitud.N4c15e7fd22(i);
    } else if (((Double) i[0]).doubleValue() > 9.949157623799753) {
    p = WekaWrapperMagnitud.N78e94dcf45(i);
    } 
    return p;
  }
  static double N4c15e7fd22(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 4;
    } else if (((Double) i[4]).doubleValue() <= -0.940759372385977) {
    p = WekaWrapperMagnitud.N2398695723(i);
    } else if (((Double) i[4]).doubleValue() > -0.940759372385977) {
    p = WekaWrapperMagnitud.N7d3a22a926(i);
    } 
    return p;
  }
  static double N2398695723(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() <= 0.9682102095628817) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() > 0.9682102095628817) {
    p = WekaWrapperMagnitud.N23f7d05d24(i);
    } 
    return p;
  }
  static double N23f7d05d24(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 5;
    } else if (((Double) i[7]).doubleValue() <= 6.953125) {
      p = 5;
    } else if (((Double) i[7]).doubleValue() > 6.953125) {
    p = WekaWrapperMagnitud.N1e73049525(i);
    } 
    return p;
  }
  static double N1e73049525(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 5;
    } else if (((Double) i[12]).doubleValue() <= 0.04871287475772786) {
      p = 5;
    } else if (((Double) i[12]).doubleValue() > 0.04871287475772786) {
      p = 4;
    } 
    return p;
  }
  static double N7d3a22a926(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 4;
    } else if (((Double) i[11]).doubleValue() <= -0.3855045511585117) {
      p = 4;
    } else if (((Double) i[11]).doubleValue() > -0.3855045511585117) {
    p = WekaWrapperMagnitud.N1d082e8827(i);
    } 
    return p;
  }
  static double N1d082e8827(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 1.9992308258341935) {
    p = WekaWrapperMagnitud.N60704c28(i);
    } else if (((Double) i[9]).doubleValue() > 1.9992308258341935) {
    p = WekaWrapperMagnitud.N6b19b7929(i);
    } 
    return p;
  }
  static double N60704c28(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 9.860754691928515) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 9.860754691928515) {
      p = 5;
    } 
    return p;
  }
  static double N6b19b7929(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 4;
    } else if (((Double) i[6]).doubleValue() <= 96.31027773379337) {
    p = WekaWrapperMagnitud.N2a32de6c30(i);
    } else if (((Double) i[6]).doubleValue() > 96.31027773379337) {
    p = WekaWrapperMagnitud.N7692d9cc31(i);
    } 
    return p;
  }
  static double N2a32de6c30(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() <= 1.3293389682741577) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() > 1.3293389682741577) {
      p = 5;
    } 
    return p;
  }
  static double N7692d9cc31(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 5;
    } else if (((Double) i[3]).doubleValue() <= 8.781424553376388) {
    p = WekaWrapperMagnitud.N75f3254232(i);
    } else if (((Double) i[3]).doubleValue() > 8.781424553376388) {
    p = WekaWrapperMagnitud.N2fd6b6c739(i);
    } 
    return p;
  }
  static double N75f3254232(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 5;
    } else if (((Double) i[6]).doubleValue() <= 99.21637420026342) {
    p = WekaWrapperMagnitud.N7f1302d633(i);
    } else if (((Double) i[6]).doubleValue() > 99.21637420026342) {
    p = WekaWrapperMagnitud.N184cf7cf38(i);
    } 
    return p;
  }
  static double N7f1302d633(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 5;
    } else if (((Double) i[11]).doubleValue() <= 0.0936629934835641) {
    p = WekaWrapperMagnitud.N43ee72e634(i);
    } else if (((Double) i[11]).doubleValue() > 0.0936629934835641) {
      p = 5;
    } 
    return p;
  }
  static double N43ee72e634(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 5;
    } else if (((Double) i[9]).doubleValue() <= 2.266017473984169) {
    p = WekaWrapperMagnitud.N23529fee35(i);
    } else if (((Double) i[9]).doubleValue() > 2.266017473984169) {
    p = WekaWrapperMagnitud.N2805c96b37(i);
    } 
    return p;
  }
  static double N23529fee35(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() <= 0.8027804499249154) {
    p = WekaWrapperMagnitud.N4fe767f336(i);
    } else if (((Double) i[8]).doubleValue() > 0.8027804499249154) {
      p = 5;
    } 
    return p;
  }
  static double N4fe767f336(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 5;
    } else if (((Double) i[1]).doubleValue() <= 0.6657617814193661) {
      p = 5;
    } else if (((Double) i[1]).doubleValue() > 0.6657617814193661) {
      p = 4;
    } 
    return p;
  }
  static double N2805c96b37(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 0.9189950998586243) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() > 0.9189950998586243) {
      p = 1;
    } 
    return p;
  }
  static double N184cf7cf38(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 4;
    } else if (((Double) i[6]).doubleValue() <= 99.38641024581294) {
      p = 4;
    } else if (((Double) i[6]).doubleValue() > 99.38641024581294) {
      p = 5;
    } 
    return p;
  }
  static double N2fd6b6c739(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 5;
    } else if (((Double) i[6]).doubleValue() <= 97.43284214419523) {
      p = 5;
    } else if (((Double) i[6]).doubleValue() > 97.43284214419523) {
    p = WekaWrapperMagnitud.N5bfa943140(i);
    } 
    return p;
  }
  static double N5bfa943140(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 4;
    } else if (((Double) i[4]).doubleValue() <= 0.20224758461250286) {
    p = WekaWrapperMagnitud.N5db250b441(i);
    } else if (((Double) i[4]).doubleValue() > 0.20224758461250286) {
    p = WekaWrapperMagnitud.N38c5cc4c43(i);
    } 
    return p;
  }
  static double N5db250b441(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 4;
    } else if (((Double) i[10]).doubleValue() <= -1.8004005292944203) {
    p = WekaWrapperMagnitud.N223f364242(i);
    } else if (((Double) i[10]).doubleValue() > -1.8004005292944203) {
      p = 4;
    } 
    return p;
  }
  static double N223f364242(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 4;
    } else if (((Double) i[10]).doubleValue() <= -1.916902005179586) {
      p = 4;
    } else if (((Double) i[10]).doubleValue() > -1.916902005179586) {
      p = 5;
    } 
    return p;
  }
  static double N38c5cc4c43(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 4;
    } else if (((Double) i[7]).doubleValue() <= 6.96875) {
    p = WekaWrapperMagnitud.N37918c7944(i);
    } else if (((Double) i[7]).doubleValue() > 6.96875) {
      p = 5;
    } 
    return p;
  }
  static double N37918c7944(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 4;
    } else if (((Double) i[0]).doubleValue() <= 9.897600354402929) {
      p = 4;
    } else if (((Double) i[0]).doubleValue() > 9.897600354402929) {
      p = 5;
    } 
    return p;
  }
  static double N78e94dcf45(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() <= 0.7032204761030076) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() > 0.7032204761030076) {
    p = WekaWrapperMagnitud.N233fe9b646(i);
    } 
    return p;
  }
  static double N233fe9b646(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 4;
    } else if (((Double) i[0]).doubleValue() <= 10.42444072840509) {
    p = WekaWrapperMagnitud.N358ee63147(i);
    } else if (((Double) i[0]).doubleValue() > 10.42444072840509) {
    p = WekaWrapperMagnitud.N3d121db353(i);
    } 
    return p;
  }
  static double N358ee63147(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 4;
    } else if (((Double) i[7]).doubleValue() <= 6.921875) {
      p = 4;
    } else if (((Double) i[7]).doubleValue() > 6.921875) {
    p = WekaWrapperMagnitud.Nec756bd48(i);
    } 
    return p;
  }
  static double Nec756bd48(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 4;
    } else if (((Double) i[7]).doubleValue() <= 6.9375) {
    p = WekaWrapperMagnitud.N3c72f59f49(i);
    } else if (((Double) i[7]).doubleValue() > 6.9375) {
    p = WekaWrapperMagnitud.N16e7dcfd52(i);
    } 
    return p;
  }
  static double N3c72f59f49(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 5;
    } else if (((Double) i[4]).doubleValue() <= -0.6028866895345456) {
      p = 5;
    } else if (((Double) i[4]).doubleValue() > -0.6028866895345456) {
    p = WekaWrapperMagnitud.N60dcc9fe50(i);
    } 
    return p;
  }
  static double N60dcc9fe50(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 4;
    } else if (((Double) i[4]).doubleValue() <= 0.20122675520673927) {
      p = 4;
    } else if (((Double) i[4]).doubleValue() > 0.20122675520673927) {
    p = WekaWrapperMagnitud.N222114ba51(i);
    } 
    return p;
  }
  static double N222114ba51(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 5;
    } else if (((Double) i[11]).doubleValue() <= 0.09160750874746852) {
      p = 5;
    } else if (((Double) i[11]).doubleValue() > 0.09160750874746852) {
      p = 4;
    } 
    return p;
  }
  static double N16e7dcfd52(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 5;
    } else if (((Double) i[5]).doubleValue() <= -0.9867437027014083) {
      p = 5;
    } else if (((Double) i[5]).doubleValue() > -0.9867437027014083) {
      p = 4;
    } 
    return p;
  }
  static double N3d121db353(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 4;
    } else if (((Double) i[3]).doubleValue() <= 8.106312989055509) {
    p = WekaWrapperMagnitud.N3b07a0d654(i);
    } else if (((Double) i[3]).doubleValue() > 8.106312989055509) {
      p = 5;
    } 
    return p;
  }
  static double N3b07a0d654(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 5;
    } else if (((Double) i[13]).doubleValue() <= 8.989010148687743) {
      p = 5;
    } else if (((Double) i[13]).doubleValue() > 8.989010148687743) {
      p = 4;
    } 
    return p;
  }
  static double N11a9e7c855(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 17.050841891280598) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() > 17.050841891280598) {
      p = 2;
    } 
    return p;
  }
  static double N3901d13456(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 5;
    } else if (((Double) i[10]).doubleValue() <= -1.38979460404539) {
    p = WekaWrapperMagnitud.N14d3bc2257(i);
    } else if (((Double) i[10]).doubleValue() > -1.38979460404539) {
    p = WekaWrapperMagnitud.N4df50bcc91(i);
    } 
    return p;
  }
  static double N14d3bc2257(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 10.07799553900821) {
    p = WekaWrapperMagnitud.N12d4bf7e58(i);
    } else if (((Double) i[0]).doubleValue() > 10.07799553900821) {
    p = WekaWrapperMagnitud.N29176cc169(i);
    } 
    return p;
  }
  static double N12d4bf7e58(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 5;
    } else if (((Double) i[2]).doubleValue() <= 11.77970925648061) {
    p = WekaWrapperMagnitud.N4c1d9d4b59(i);
    } else if (((Double) i[2]).doubleValue() > 11.77970925648061) {
    p = WekaWrapperMagnitud.N7b227d8d60(i);
    } 
    return p;
  }
  static double N4c1d9d4b59(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 4;
    } else if (((Double) i[4]).doubleValue() <= -0.3955908219573785) {
      p = 4;
    } else if (((Double) i[4]).doubleValue() > -0.3955908219573785) {
      p = 5;
    } 
    return p;
  }
  static double N7b227d8d60(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 9.942556380531517) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() > 9.942556380531517) {
    p = WekaWrapperMagnitud.N7219ec6761(i);
    } 
    return p;
  }
  static double N7219ec6761(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 5;
    } else if (((Double) i[4]).doubleValue() <= 0.28721077351926344) {
      p = 5;
    } else if (((Double) i[4]).doubleValue() > 0.28721077351926344) {
    p = WekaWrapperMagnitud.N4501821562(i);
    } 
    return p;
  }
  static double N4501821562(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 5;
    } else if (((Double) i[9]).doubleValue() <= 2.41467118558188) {
    p = WekaWrapperMagnitud.N65d6b83b63(i);
    } else if (((Double) i[9]).doubleValue() > 2.41467118558188) {
    p = WekaWrapperMagnitud.Nd706f1964(i);
    } 
    return p;
  }
  static double N65d6b83b63(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 4;
    } else if (((Double) i[5]).doubleValue() <= -0.48322873418524237) {
      p = 4;
    } else if (((Double) i[5]).doubleValue() > -0.48322873418524237) {
      p = 5;
    } 
    return p;
  }
  static double Nd706f1964(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 15.782859299133422) {
    p = WekaWrapperMagnitud.N30b7c00465(i);
    } else if (((Double) i[2]).doubleValue() > 15.782859299133422) {
      p = 5;
    } 
    return p;
  }
  static double N30b7c00465(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 4;
    } else if (((Double) i[3]).doubleValue() <= 8.109725593590927) {
    p = WekaWrapperMagnitud.N79efed2d66(i);
    } else if (((Double) i[3]).doubleValue() > 8.109725593590927) {
      p = 5;
    } 
    return p;
  }
  static double N79efed2d66(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 4;
    } else if (((Double) i[0]).doubleValue() <= 10.043293258073449) {
    p = WekaWrapperMagnitud.N2928854b67(i);
    } else if (((Double) i[0]).doubleValue() > 10.043293258073449) {
      p = 1;
    } 
    return p;
  }
  static double N2928854b67(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 9.98298274910079) {
    p = WekaWrapperMagnitud.N27ae2fd068(i);
    } else if (((Double) i[0]).doubleValue() > 9.98298274910079) {
      p = 4;
    } 
    return p;
  }
  static double N27ae2fd068(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 4;
    } else if (((Double) i[0]).doubleValue() <= 9.958041424144788) {
      p = 4;
    } else if (((Double) i[0]).doubleValue() > 9.958041424144788) {
      p = 1;
    } 
    return p;
  }
  static double N29176cc169(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 5;
    } else if (((Double) i[2]).doubleValue() <= 14.59431828215516) {
    p = WekaWrapperMagnitud.N2f177a4b70(i);
    } else if (((Double) i[2]).doubleValue() > 14.59431828215516) {
    p = WekaWrapperMagnitud.N77167fb776(i);
    } 
    return p;
  }
  static double N2f177a4b70(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 4;
    } else if (((Double) i[6]).doubleValue() <= 104.28557544229817) {
      p = 4;
    } else if (((Double) i[6]).doubleValue() > 104.28557544229817) {
    p = WekaWrapperMagnitud.N4278a03f71(i);
    } 
    return p;
  }
  static double N4278a03f71(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 5;
    } else if (((Double) i[4]).doubleValue() <= 0.3192111395530337) {
    p = WekaWrapperMagnitud.N147ed70f72(i);
    } else if (((Double) i[4]).doubleValue() > 0.3192111395530337) {
    p = WekaWrapperMagnitud.N124c278f74(i);
    } 
    return p;
  }
  static double N147ed70f72(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 4;
    } else if (((Double) i[7]).doubleValue() <= 6.90625) {
      p = 4;
    } else if (((Double) i[7]).doubleValue() > 6.90625) {
    p = WekaWrapperMagnitud.N61dd02573(i);
    } 
    return p;
  }
  static double N61dd02573(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 4;
    } else if (((Double) i[4]).doubleValue() <= -1.112600017125931) {
      p = 4;
    } else if (((Double) i[4]).doubleValue() > -1.112600017125931) {
      p = 5;
    } 
    return p;
  }
  static double N124c278f74(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 5;
    } else if (((Double) i[8]).doubleValue() <= 1.9099399198698848) {
      p = 5;
    } else if (((Double) i[8]).doubleValue() > 1.9099399198698848) {
    p = WekaWrapperMagnitud.N15b204a175(i);
    } 
    return p;
  }
  static double N15b204a175(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 10.275103065989821) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 10.275103065989821) {
      p = 4;
    } 
    return p;
  }
  static double N77167fb776(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 4.252792263637099) {
    p = WekaWrapperMagnitud.N1fe2058877(i);
    } else if (((Double) i[8]).doubleValue() > 4.252792263637099) {
    p = WekaWrapperMagnitud.N25d250c690(i);
    } 
    return p;
  }
  static double N1fe2058877(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 5;
    } else if (((Double) i[1]).doubleValue() <= 2.1182825864241184) {
    p = WekaWrapperMagnitud.N6ce139a478(i);
    } else if (((Double) i[1]).doubleValue() > 2.1182825864241184) {
    p = WekaWrapperMagnitud.N229d10bd81(i);
    } 
    return p;
  }
  static double N6ce139a478(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 5;
    } else if (((Double) i[4]).doubleValue() <= 0.40585717042001584) {
      p = 5;
    } else if (((Double) i[4]).doubleValue() > 0.40585717042001584) {
    p = WekaWrapperMagnitud.N6973bf9579(i);
    } 
    return p;
  }
  static double N6973bf9579(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 107.96699561485603) {
    p = WekaWrapperMagnitud.N2ddc8ecb80(i);
    } else if (((Double) i[6]).doubleValue() > 107.96699561485603) {
      p = 1;
    } 
    return p;
  }
  static double N2ddc8ecb80(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 10.231307956930616) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 10.231307956930616) {
      p = 2;
    } 
    return p;
  }
  static double N229d10bd81(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 5;
    } else if (((Double) i[3]).doubleValue() <= 4.407536544907301) {
    p = WekaWrapperMagnitud.N4754215382(i);
    } else if (((Double) i[3]).doubleValue() > 4.407536544907301) {
    p = WekaWrapperMagnitud.N7a4ccb5384(i);
    } 
    return p;
  }
  static double N4754215382(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 4;
    } else if (((Double) i[3]).doubleValue() <= 3.908820094996991) {
    p = WekaWrapperMagnitud.N33afa13b83(i);
    } else if (((Double) i[3]).doubleValue() > 3.908820094996991) {
      p = 5;
    } 
    return p;
  }
  static double N33afa13b83(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 2.7319257774619157) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() > 2.7319257774619157) {
      p = 5;
    } 
    return p;
  }
  static double N7a4ccb5384(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 5;
    } else if (((Double) i[13]).doubleValue() <= 8.839060847909556) {
    p = WekaWrapperMagnitud.N309e345f85(i);
    } else if (((Double) i[13]).doubleValue() > 8.839060847909556) {
    p = WekaWrapperMagnitud.N56a6d5a686(i);
    } 
    return p;
  }
  static double N309e345f85(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 5;
    } else if (((Double) i[1]).doubleValue() <= 2.547949110849053) {
      p = 5;
    } else if (((Double) i[1]).doubleValue() > 2.547949110849053) {
      p = 1;
    } 
    return p;
  }
  static double N56a6d5a686(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 10.145863116013782) {
    p = WekaWrapperMagnitud.N18ce003087(i);
    } else if (((Double) i[0]).doubleValue() > 10.145863116013782) {
    p = WekaWrapperMagnitud.N444562988(i);
    } 
    return p;
  }
  static double N18ce003087(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 5;
    } else if (((Double) i[7]).doubleValue() <= 6.953125) {
      p = 5;
    } else if (((Double) i[7]).doubleValue() > 6.953125) {
      p = 1;
    } 
    return p;
  }
  static double N444562988(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 2.3617126567247064) {
    p = WekaWrapperMagnitud.N45b9a63289(i);
    } else if (((Double) i[1]).doubleValue() > 2.3617126567247064) {
      p = 1;
    } 
    return p;
  }
  static double N45b9a63289(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 16.389554723800263) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() > 16.389554723800263) {
      p = 1;
    } 
    return p;
  }
  static double N25d250c690(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 2.365281903635394) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 2.365281903635394) {
      p = 5;
    } 
    return p;
  }
  static double N4df50bcc91(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 0;
    } else if (((Double) i[12]).doubleValue() <= 0.1854094218859732) {
    p = WekaWrapperMagnitud.N6b26e94592(i);
    } else if (((Double) i[12]).doubleValue() > 0.1854094218859732) {
    p = WekaWrapperMagnitud.N63a65a2593(i);
    } 
    return p;
  }
  static double N6b26e94592(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 5;
    } else if (((Double) i[10]).doubleValue() <= -1.1952128057755667) {
      p = 5;
    } else if (((Double) i[10]).doubleValue() > -1.1952128057755667) {
      p = 0;
    } 
    return p;
  }
  static double N63a65a2593(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 8.733945295962078) {
    p = WekaWrapperMagnitud.N54c562f794(i);
    } else if (((Double) i[13]).doubleValue() > 8.733945295962078) {
    p = WekaWrapperMagnitud.N318ba8c895(i);
    } 
    return p;
  }
  static double N54c562f794(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 2.2413025816233323) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 2.2413025816233323) {
      p = 5;
    } 
    return p;
  }
  static double N318ba8c895(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (((Double) i[1]).doubleValue() <= 2.756549525776559) {
    p = WekaWrapperMagnitud.N6dbb137d96(i);
    } else if (((Double) i[1]).doubleValue() > 2.756549525776559) {
      p = 1;
    } 
    return p;
  }
  static double N6dbb137d96(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 4;
    } else if (((Double) i[11]).doubleValue() <= -0.26721863367441806) {
    p = WekaWrapperMagnitud.N3c9d0b9d97(i);
    } else if (((Double) i[11]).doubleValue() > -0.26721863367441806) {
    p = WekaWrapperMagnitud.N4330142398(i);
    } 
    return p;
  }
  static double N3c9d0b9d97(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 4;
    } else if (((Double) i[12]).doubleValue() <= 0.4560305309063756) {
      p = 4;
    } else if (((Double) i[12]).doubleValue() > 0.4560305309063756) {
      p = 5;
    } 
    return p;
  }
  static double N4330142398(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 5;
    } else if (((Double) i[6]).doubleValue() <= 100.13580084419856) {
      p = 5;
    } else if (((Double) i[6]).doubleValue() > 100.13580084419856) {
    p = WekaWrapperMagnitud.N2f11296599(i);
    } 
    return p;
  }
  static double N2f11296599(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 6.9375) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 6.9375) {
    p = WekaWrapperMagnitud.N1a04f701100(i);
    } 
    return p;
  }
  static double N1a04f701100(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 4;
    } else if (((Double) i[10]).doubleValue() <= -1.2729267784079186) {
      p = 4;
    } else if (((Double) i[10]).doubleValue() > -1.2729267784079186) {
      p = 1;
    } 
    return p;
  }
  static double N4e91d63f101(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 5.003881112651289) {
    p = WekaWrapperMagnitud.Nd4342c2102(i);
    } else if (((Double) i[8]).doubleValue() > 5.003881112651289) {
    p = WekaWrapperMagnitud.N6ac13091123(i);
    } 
    return p;
  }
  static double Nd4342c2102(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 11.509297929714823) {
    p = WekaWrapperMagnitud.N2bbf180e103(i);
    } else if (((Double) i[0]).doubleValue() > 11.509297929714823) {
    p = WekaWrapperMagnitud.N12e61fe6119(i);
    } 
    return p;
  }
  static double N2bbf180e103(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 5;
    } else if (((Double) i[3]).doubleValue() <= 2.682580294257568) {
    p = WekaWrapperMagnitud.N163e4e87104(i);
    } else if (((Double) i[3]).doubleValue() > 2.682580294257568) {
    p = WekaWrapperMagnitud.N56de5251105(i);
    } 
    return p;
  }
  static double N163e4e87104(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 2.998639544910029) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 2.998639544910029) {
      p = 5;
    } 
    return p;
  }
  static double N56de5251105(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 2.3808584086328892) {
    p = WekaWrapperMagnitud.N419c5f1a106(i);
    } else if (((Double) i[8]).doubleValue() > 2.3808584086328892) {
    p = WekaWrapperMagnitud.N6193932a111(i);
    } 
    return p;
  }
  static double N419c5f1a106(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (((Double) i[2]).doubleValue() <= 19.912529751044868) {
    p = WekaWrapperMagnitud.N12b0404f107(i);
    } else if (((Double) i[2]).doubleValue() > 19.912529751044868) {
    p = WekaWrapperMagnitud.N5276e6b0109(i);
    } 
    return p;
  }
  static double N12b0404f107(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 4;
    } else if (((Double) i[7]).doubleValue() <= 6.9375) {
      p = 4;
    } else if (((Double) i[7]).doubleValue() > 6.9375) {
    p = WekaWrapperMagnitud.N769e7ee8108(i);
    } 
    return p;
  }
  static double N769e7ee8108(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 2.7618270048734637) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 2.7618270048734637) {
      p = 4;
    } 
    return p;
  }
  static double N5276e6b0109(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() <= 1.4982229769117286) {
      p = 4;
    } else if (((Double) i[8]).doubleValue() > 1.4982229769117286) {
    p = WekaWrapperMagnitud.N71b1176b110(i);
    } 
    return p;
  }
  static double N71b1176b110(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 10.068495794846335) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() > 10.068495794846335) {
      p = 1;
    } 
    return p;
  }
  static double N6193932a111(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 21.65767513786922) {
    p = WekaWrapperMagnitud.N647fd8ce112(i);
    } else if (((Double) i[2]).doubleValue() > 21.65767513786922) {
      p = 1;
    } 
    return p;
  }
  static double N647fd8ce112(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 5;
    } else if (((Double) i[13]).doubleValue() <= 7.469757488067028) {
      p = 5;
    } else if (((Double) i[13]).doubleValue() > 7.469757488067028) {
    p = WekaWrapperMagnitud.N159f197113(i);
    } 
    return p;
  }
  static double N159f197113(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -1.906308367802768) {
    p = WekaWrapperMagnitud.N78aab498114(i);
    } else if (((Double) i[10]).doubleValue() > -1.906308367802768) {
    p = WekaWrapperMagnitud.N5dd6264115(i);
    } 
    return p;
  }
  static double N78aab498114(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 5;
    } else if (((Double) i[9]).doubleValue() <= 2.3363452786489316) {
      p = 5;
    } else if (((Double) i[9]).doubleValue() > 2.3363452786489316) {
      p = 1;
    } 
    return p;
  }
  static double N5dd6264115(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 19.912529751044868) {
    p = WekaWrapperMagnitud.N1ffe63b9116(i);
    } else if (((Double) i[2]).doubleValue() > 19.912529751044868) {
      p = 1;
    } 
    return p;
  }
  static double N1ffe63b9116(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 2.914146326608752) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 2.914146326608752) {
    p = WekaWrapperMagnitud.N51e5fc98117(i);
    } 
    return p;
  }
  static double N51e5fc98117(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 10.840835765413175) {
    p = WekaWrapperMagnitud.N7c469c48118(i);
    } else if (((Double) i[0]).doubleValue() > 10.840835765413175) {
      p = 2;
    } 
    return p;
  }
  static double N7c469c48118(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 2;
    } else if (((Double) i[10]).doubleValue() <= -1.6713054768813522) {
      p = 2;
    } else if (((Double) i[10]).doubleValue() > -1.6713054768813522) {
      p = 1;
    } 
    return p;
  }
  static double N12e61fe6119(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 2;
    } else if (((Double) i[5]).doubleValue() <= 1.525004851653251) {
    p = WekaWrapperMagnitud.N7ee955a8120(i);
    } else if (((Double) i[5]).doubleValue() > 1.525004851653251) {
    p = WekaWrapperMagnitud.N48fa0f47122(i);
    } 
    return p;
  }
  static double N7ee955a8120(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 3.1258580679208525) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 3.1258580679208525) {
    p = WekaWrapperMagnitud.N1677d1121(i);
    } 
    return p;
  }
  static double N1677d1121(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() <= 4.85519629006318) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() > 4.85519629006318) {
      p = 5;
    } 
    return p;
  }
  static double N48fa0f47122(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 5;
    } else if (((Double) i[8]).doubleValue() <= 3.036058897285937) {
      p = 5;
    } else if (((Double) i[8]).doubleValue() > 3.036058897285937) {
      p = 1;
    } 
    return p;
  }
  static double N6ac13091123(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 5;
    } else if (((Double) i[4]).doubleValue() <= 0.19566339382829082) {
    p = WekaWrapperMagnitud.N5e316c74124(i);
    } else if (((Double) i[4]).doubleValue() > 0.19566339382829082) {
    p = WekaWrapperMagnitud.N4313f5bc128(i);
    } 
    return p;
  }
  static double N5e316c74124(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 5;
    } else if (((Double) i[0]).doubleValue() <= 11.113095465520917) {
    p = WekaWrapperMagnitud.N6d2a209c125(i);
    } else if (((Double) i[0]).doubleValue() > 11.113095465520917) {
    p = WekaWrapperMagnitud.N75329a49126(i);
    } 
    return p;
  }
  static double N6d2a209c125(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 5;
    } else if (((Double) i[2]).doubleValue() <= 21.74643850114458) {
      p = 5;
    } else if (((Double) i[2]).doubleValue() > 21.74643850114458) {
      p = 1;
    } 
    return p;
  }
  static double N75329a49126(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() <= 2.3772114640439574) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() > 2.3772114640439574) {
    p = WekaWrapperMagnitud.N161479c6127(i);
    } 
    return p;
  }
  static double N161479c6127(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 5;
    } else if (((Double) i[3]).doubleValue() <= 1.8755094503691585) {
      p = 5;
    } else if (((Double) i[3]).doubleValue() > 1.8755094503691585) {
      p = 2;
    } 
    return p;
  }
  static double N4313f5bc128(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 4.783737003779161) {
    p = WekaWrapperMagnitud.N7f010382129(i);
    } else if (((Double) i[1]).doubleValue() > 4.783737003779161) {
    p = WekaWrapperMagnitud.N670002133(i);
    } 
    return p;
  }
  static double N7f010382129(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 2;
    } else if (((Double) i[5]).doubleValue() <= 0.10407768080703717) {
    p = WekaWrapperMagnitud.N1e802ef9130(i);
    } else if (((Double) i[5]).doubleValue() > 0.10407768080703717) {
    p = WekaWrapperMagnitud.N2b6faea6131(i);
    } 
    return p;
  }
  static double N1e802ef9130(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 5;
    } else if (((Double) i[2]).doubleValue() <= 19.015689360304975) {
      p = 5;
    } else if (((Double) i[2]).doubleValue() > 19.015689360304975) {
      p = 2;
    } 
    return p;
  }
  static double N2b6faea6131(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 11.745677785045784) {
    p = WekaWrapperMagnitud.N778d1062132(i);
    } else if (((Double) i[0]).doubleValue() > 11.745677785045784) {
      p = 2;
    } 
    return p;
  }
  static double N778d1062132(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 1;
    } else if (((Double) i[12]).doubleValue() <= 0.1760133202980855) {
      p = 1;
    } else if (((Double) i[12]).doubleValue() > 0.1760133202980855) {
      p = 2;
    } 
    return p;
  }
  static double N670002133(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 2;
    } else if (((Double) i[5]).doubleValue() <= 2.1933163755639287) {
      p = 2;
    } else if (((Double) i[5]).doubleValue() > 2.1933163755639287) {
    p = WekaWrapperMagnitud.N1f0f1111134(i);
    } 
    return p;
  }
  static double N1f0f1111134(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 2;
    } else if (((Double) i[7]).doubleValue() <= 6.96875) {
    p = WekaWrapperMagnitud.N49c386c8135(i);
    } else if (((Double) i[7]).doubleValue() > 6.96875) {
      p = 1;
    } 
    return p;
  }
  static double N49c386c8135(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 2;
    } else if (((Double) i[5]).doubleValue() <= 3.156827974276167) {
      p = 2;
    } else if (((Double) i[5]).doubleValue() > 3.156827974276167) {
      p = 1;
    } 
    return p;
  }
}

