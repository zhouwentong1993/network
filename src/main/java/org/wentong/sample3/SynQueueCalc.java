package org.wentong.sample3;

public class SynQueueCalc {

    public static void main(String[] args) {
        int nr_table_entries = 128;
        int sysctl_max_syn_backlog = 1000;
        int max_qlen_log = 3;
        nr_table_entries = Math.min(nr_table_entries, sysctl_max_syn_backlog);
        nr_table_entries = Math.max(nr_table_entries, 8);
        nr_table_entries = roundup_pow_of_two(nr_table_entries + 1);

        for (max_qlen_log = 3;
             (1 << max_qlen_log) < nr_table_entries;
             max_qlen_log++)
            ;
        System.out.println(max_qlen_log);
    }



    static int roundup_pow_of_two(int cap) {
        int n = -1 >>> Integer.numberOfLeadingZeros(cap - 1);
        return  n + 1;
    }

}
