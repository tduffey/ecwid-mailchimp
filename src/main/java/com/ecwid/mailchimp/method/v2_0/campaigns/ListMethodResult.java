/*
 * Copyright 2013 Ecwid, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ecwid.mailchimp.method.v2_0.campaigns;

import java.util.Date;
import java.util.List;

import com.ecwid.mailchimp.MailChimpObject;

/**
 * result of the campaigns/list operation including valid data and any errors
 */
public class ListMethodResult extends MailChimpObject {

    @Field
    public Integer total;

    @Field
    public List<Data> data;

    @Field
    public List<Error> errors;

    /**
     * structs for the lists which matched the provided filters, including the following
     */
    public static class Data extends MailChimpObject {
        @Field
        public String id;

        @Field
        public Integer web_id;
        
        @Field
        public String list_id;
        
        @Field
        public Integer folder_id;
        
        @Field
        public Integer template_id;

        @Field
        public String content_type;
        
        @Field
        public String title;
        
        @Field
        public String type;

        @Field
        public Date create_time;
        
        @Field
        public Date send_time;

        @Field
        public Integer emails_sent;     

        @Field
        public String status;

        @Field
        public String from_name;
        
        @Field
        public String from_email;
        
        @Field
        public String subject;

        @Field
        public String to_name;
        
        @Field
        public String archive_url;

        @Field
        public Boolean inline_css;
     
        @Field
        public String analytics;
        
        @Field
        public String analytics_tag;
        
        @Field
        public Boolean authenticate;
        
        @Field
        public Boolean ecomm360;

        @Field
        public Boolean auto_tweet;

        @Field
        public Boolean auto_footer;

        @Field
        public Boolean timewarp;
        
        @Field
        public Date timewarp_schedule;
        
        @Field
        public String parent_id;
        
        @Field
        public Boolean is_child;
        
        @Field
        public String tests_sent;
        
        @Field
        public Integer tests_remain;     
        
        @Field
        public Tracking stats;
        
        @Field
        public String segment_text;

        // TODO:
        //@Field
        //public List<SegmentOpts> segment_opts;
        
        //@Field
        //public SavedSegment saved_segment;
        
        // TODO:
        //@Field
        //public TypeOpts[] type_opts;
        
        @Field
        public Integer comments_total;
        
        @Field
        public Integer comments_unread;
        
        @Field
        public Summary summary;
        
    }

    public static class Tracking extends MailChimpObject {

        @Field
        public Boolean html_clicks;

        @Field
        public Boolean text_clicks;

        @Field
        public Boolean opens;

    }
    
    public static class Summary extends MailChimpObject {
    	
    	@Field
    	public Integer syntax_errors;
    	
    	@Field
    	public Integer hard_bounces;
    	
    	@Field
    	public Integer soft_bounces;
    	
    	@Field
    	public Integer unsubscribes;
    	
    	@Field
    	public Integer abuse_reports;
    	
    	@Field
    	public Integer forwards;
    	
    	@Field
    	public Integer forwards_opens;
    	
    	@Field
    	public Integer opens;
    	
    	@Field
    	public Date last_open;
    	
    	@Field
    	public Integer unique_opens;
    	
    	@Field
    	public Integer clicks;
    	
    	@Field
    	public Integer unique_clicks;
    	
    	@Field
    	public Date last_click;
    	
    	@Field
    	public Integer users_who_clicked;
    	
    	@Field
    	public Integer emails_sent;
    	
    	@Field
    	public Integer unique_likes;
    	
    	@Field
    	public Integer recipient_likes;
    	
    	@Field
    	public Integer facebook_likes;
    	
    	@Field
    	public Industry industry;
    	
    	@Field
    	public List<Absplit> absplit;
    	
    	@Field
    	public List<Timewarp> timewarp;
    	
    	@Field
    	public List<Timeseries> timeseries;
    	
    	public static class Industry extends MailChimpObject {
    		
    		@Field
    		public String type;
    		
    		@Field
    		public Double open_rate;
    		
    		@Field
    		public Double click_rate;
    		
    		@Field
    		public Double bounce_rate;
    		
    		@Field
    		public Double unopen_rate;
    		
    		@Field
    		public Double unsub_rate;
    		
    		@Field
    		public Double abuse_rate;
    		
    	}
    	
    	public static class Absplit extends MailChimpObject {
    		
    		@Field
    		public Integer bounces_a;
    		
    		@Field
    		public Integer bounces_b;
    		
    		@Field
    		public Integer forwards_a;
    		
    		@Field
    		public Integer forwards_b;
    		
    		@Field
    		public Integer abuse_reports_a;
    		
    		@Field
    		public Integer abuse_reports_b;
    		
    		@Field
    		public Integer unsubs_a;
    		
    		@Field
    		public Integer unsubs_b;

    		@Field
    		public Integer recipients_click_a;
    		
    		@Field
    		public Integer recipients_click_b;
    		
    		@Field
    		public Integer forwards_opens_a;
    		
    		@Field
    		public Integer forwards_opens_b;
    		
    		@Field
    		public Integer opens_a;
    		
    		@Field
    		public Integer opens_b;

    		@Field
    		public Date last_open_a;
    		
    		@Field
    		public Date last_open_b;
    		
    		@Field
    		public Integer unique_opens_a;
    		
    		@Field
    		public Integer unique_opens_b;
    		
    	}
    	
    	public static class Timewarp extends MailChimpObject {
    		
    		@Field
    		public Integer opens;
    		
    		@Field
    		public Date last_open;
    		
    		@Field
    		public Integer unique_opens;
    		
    		@Field
    		public Integer clicks;
    		
    		@Field
    		public Date last_click;
    		
    		@Field
    		public Integer unique_clicks;
    		
    		@Field
    		public Integer bounces;
    		
    		@Field
    		public Integer total;
    		
    		@Field
    		public Integer sent;
    		
    	}
    	
    	public static class Timeseries extends MailChimpObject {
    		
    		@Field
    		public Date timestamp;
    		
    		@Field
    		public Integer emails_sent;
    		
    		@Field
    		public Integer unique_opens;
    		
    		@Field
    		public Integer recipients_click;
    		
    	}
    }

    public static class Error extends MailChimpObject {
        @Field
        public String param;

        @Field
        public Integer code;

        @Field
        public String error;
    }
}
