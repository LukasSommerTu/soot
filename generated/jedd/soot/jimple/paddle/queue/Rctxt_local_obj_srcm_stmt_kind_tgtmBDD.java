package soot.jimple.paddle.queue;

import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import soot.jimple.paddle.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Rctxt_local_obj_srcm_stmt_kind_tgtmBDD extends Rctxt_local_obj_srcm_stmt_kind_tgtm {
    private final jedd.internal.RelationContainer bdd =
      new jedd.internal.RelationContainer(new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() },
                                          new PhysicalDomain[] { V2.v(), V1.v(), H1.v(), T1.v(), ST.v(), FD.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.ctxt:soot.jimple.padd" +
                                           "le.bdddomains.V2, soot.jimple.paddle.bdddomains.local:soot.j" +
                                           "imple.paddle.bdddomains.V1, soot.jimple.paddle.bdddomains.ob" +
                                           "j:soot.jimple.paddle.bdddomains.H1, soot.jimple.paddle.bdddo" +
                                           "mains.srcm:soot.jimple.paddle.bdddomains.T1, soot.jimple.pad" +
                                           "dle.bdddomains.stmt:soot.jimple.paddle.bdddomains.ST, soot.j" +
                                           "imple.paddle.bdddomains.kind:soot.jimple.paddle.bdddomains.F" +
                                           "D, soot.jimple.paddle.bdddomains.tgtm:soot.jimple.paddle.bdd" +
                                           "domains.T2> bdd at /home/olhotak/soot-2-jedd/src/soot/jimple" +
                                           "/paddle/queue/Rctxt_local_obj_srcm_stmt_kind_tgtmBDD.jedd:31" +
                                           ",12-75"));
    
    void add(final jedd.internal.RelationContainer tuple) { bdd.eqUnion(tuple); }
    
    public Rctxt_local_obj_srcm_stmt_kind_tgtmBDD(final jedd.internal.RelationContainer bdd) {
        this();
        add(new jedd.internal.RelationContainer(new Attribute[] { obj.v(), tgtm.v(), srcm.v(), local.v(), kind.v(), stmt.v(), ctxt.v() },
                                                new PhysicalDomain[] { H1.v(), T2.v(), T1.v(), V1.v(), FD.v(), ST.v(), V2.v() },
                                                ("add(bdd) at /home/olhotak/soot-2-jedd/src/soot/jimple/paddle" +
                                                 "/queue/Rctxt_local_obj_srcm_stmt_kind_tgtmBDD.jedd:33,131-13" +
                                                 "4"),
                                                bdd));
    }
    
    Rctxt_local_obj_srcm_stmt_kind_tgtmBDD() {
        super();
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
    }
    
    public Iterator iterator() {
        ;
        return new Iterator() {
            private Iterator it;
            
            public boolean hasNext() {
                if (it != null && it.hasNext()) return true;
                if (!jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(bdd), jedd.internal.Jedd.v().falseBDD()))
                    return true;
                return false;
            }
            
            public Object next() {
                if (it == null || !it.hasNext()) {
                    it =
                      new jedd.internal.RelationContainer(new Attribute[] { obj.v(), tgtm.v(), srcm.v(), local.v(), kind.v(), stmt.v(), ctxt.v() },
                                                          new PhysicalDomain[] { H1.v(), T2.v(), T1.v(), V1.v(), FD.v(), ST.v(), V2.v() },
                                                          ("bdd.iterator(new jedd.Attribute[...]) at /home/olhotak/soot-" +
                                                           "2-jedd/src/soot/jimple/paddle/queue/Rctxt_local_obj_srcm_stm" +
                                                           "t_kind_tgtmBDD.jedd:45,25-28"),
                                                          bdd).iterator(new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() });
                    bdd.eq(jedd.internal.Jedd.v().falseBDD());
                }
                Object[] components = (Object[]) it.next();
                return new Tuple((Context) components[0],
                                 (Local) components[1],
                                 (AllocNode) components[2],
                                 (SootMethod) components[3],
                                 (Unit) components[4],
                                 (Kind) components[5],
                                 (SootMethod) components[6]);
            }
            
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
    
    public jedd.internal.RelationContainer get() {
        final jedd.internal.RelationContainer ret =
          new jedd.internal.RelationContainer(new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() },
                                              new PhysicalDomain[] { V2.v(), V1.v(), H1.v(), T1.v(), ST.v(), FD.v(), T2.v() },
                                              ("<soot.jimple.paddle.bdddomains.ctxt:soot.jimple.paddle.bdddo" +
                                               "mains.V2, soot.jimple.paddle.bdddomains.local:soot.jimple.pa" +
                                               "ddle.bdddomains.V1, soot.jimple.paddle.bdddomains.obj:soot.j" +
                                               "imple.paddle.bdddomains.H1, soot.jimple.paddle.bdddomains.sr" +
                                               "cm:soot.jimple.paddle.bdddomains.T1, soot.jimple.paddle.bddd" +
                                               "omains.stmt:soot.jimple.paddle.bdddomains.ST, soot.jimple.pa" +
                                               "ddle.bdddomains.kind:soot.jimple.paddle.bdddomains.FD, soot." +
                                               "jimple.paddle.bdddomains.tgtm:soot.jimple.paddle.bdddomains." +
                                               "T2> ret = bdd; at /home/olhotak/soot-2-jedd/src/soot/jimple/" +
                                               "paddle/queue/Rctxt_local_obj_srcm_stmt_kind_tgtmBDD.jedd:55," +
                                               "72-75"),
                                              bdd);
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
        return new jedd.internal.RelationContainer(new Attribute[] { obj.v(), tgtm.v(), srcm.v(), local.v(), kind.v(), stmt.v(), ctxt.v() },
                                                   new PhysicalDomain[] { H1.v(), T2.v(), T1.v(), V1.v(), FD.v(), ST.v(), V2.v() },
                                                   ("return ret; at /home/olhotak/soot-2-jedd/src/soot/jimple/pad" +
                                                    "dle/queue/Rctxt_local_obj_srcm_stmt_kind_tgtmBDD.jedd:57,8-1" +
                                                    "4"),
                                                   ret);
    }
    
    public boolean hasNext() {
        return !jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(bdd), jedd.internal.Jedd.v().falseBDD());
    }
}