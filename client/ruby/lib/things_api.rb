require "uri"

class Things_api
  basePath = "http://localhost:8080/api"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.get_subscriptions (so_id,stream_id,opts={})
    query_param_keys = []

    # verify existence of params
    raise "so_id is required" if so_id.nil?
    raise "stream_id is required" if stream_id.nil?
    # set default values and merge with input
    options = {
    :so_id => so_id,
      :stream_id => stream_id}.merge(opts)

    #resource path
    path = "/things/{soId}/streams/{streamId}/subscriptions".sub('{format}','json').sub('{' + 'soId' + '}', escapeString(so_id))
    .sub('{' + 'streamId' + '}', escapeString(stream_id))
    
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    
  end

def self.create_subscription (so_id,stream_id,body,opts={})
    query_param_keys = []

    # verify existence of params
    raise "so_id is required" if so_id.nil?
    raise "stream_id is required" if stream_id.nil?
    raise "body is required" if body.nil?
    # set default values and merge with input
    options = {
    :so_id => so_id,
      :stream_id => stream_id,
      :body => body}.merge(opts)

    #resource path
    path = "/things/{soId}/streams/{streamId}/subscriptions".sub('{format}','json').sub('{' + 'soId' + '}', escapeString(so_id))
    .sub('{' + 'streamId' + '}', escapeString(stream_id))
    
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    if body != nil
      if body.is_a?(Array)
        array = Array.new
        body.each do |item|
          if item.respond_to?("to_body".to_sym)
            array.push item.to_body
          else
            array.push item
          end
        end
        post_body = array

      else 
        if body.respond_to?("to_body".to_sym)
	        post_body = body.to_body
	      else
	        post_body = body
	      end
      end
    end
    Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    
  end

def self.get_s_o (so_id,opts={})
    query_param_keys = []

    # verify existence of params
    raise "so_id is required" if so_id.nil?
    # set default values and merge with input
    options = {
    :so_id => so_id}.merge(opts)

    #resource path
    path = "/things/{soId}".sub('{format}','json').sub('{' + 'soId' + '}', escapeString(so_id))
    
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    
  end

def self.create_s_o (body,opts={})
    query_param_keys = []

    # verify existence of params
    raise "body is required" if body.nil?
    # set default values and merge with input
    options = {
    :body => body}.merge(opts)

    #resource path
    path = "/things".sub('{format}','json')
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    if body != nil
      if body.is_a?(Array)
        array = Array.new
        body.each do |item|
          if item.respond_to?("to_body".to_sym)
            array.push item.to_body
          else
            array.push item
          end
        end
        post_body = array

      else 
        if body.respond_to?("to_body".to_sym)
	        post_body = body.to_body
	      else
	        post_body = body
	      end
      end
    end
    Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    
  end

def self.get_all_s_os (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/things".sub('{format}','json')
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    
  end

def self.get_last_update (so_id,stream_id,opts={})
    query_param_keys = []

    # verify existence of params
    raise "so_id is required" if so_id.nil?
    raise "stream_id is required" if stream_id.nil?
    # set default values and merge with input
    options = {
    :so_id => so_id,
      :stream_id => stream_id}.merge(opts)

    #resource path
    path = "/things/{soId}/streams/{streamId}/lastUpdate".sub('{format}','json').sub('{' + 'soId' + '}', escapeString(so_id))
    .sub('{' + 'streamId' + '}', escapeString(stream_id))
    
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    
  end

def self.update_s_o_data (so_id,stream_id,body,opts={})
    query_param_keys = []

    # verify existence of params
    raise "so_id is required" if so_id.nil?
    raise "stream_id is required" if stream_id.nil?
    raise "body is required" if body.nil?
    # set default values and merge with input
    options = {
    :so_id => so_id,
      :stream_id => stream_id,
      :body => body}.merge(opts)

    #resource path
    path = "/things/{soId}/streams/{streamId}".sub('{format}','json').sub('{' + 'soId' + '}', escapeString(so_id))
    .sub('{' + 'streamId' + '}', escapeString(stream_id))
    
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    if body != nil
      if body.is_a?(Array)
        array = Array.new
        body.each do |item|
          if item.respond_to?("to_body".to_sym)
            array.push item.to_body
          else
            array.push item
          end
        end
        post_body = array

      else 
        if body.respond_to?("to_body".to_sym)
	        post_body = body.to_body
	      else
	        post_body = body
	      end
      end
    end
    Swagger::Request.new(:PUT, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    
  end

def self.get_s_o_data (so_id,stream_id,opts={})
    query_param_keys = []

    # verify existence of params
    raise "so_id is required" if so_id.nil?
    raise "stream_id is required" if stream_id.nil?
    # set default values and merge with input
    options = {
    :so_id => so_id,
      :stream_id => stream_id}.merge(opts)

    #resource path
    path = "/things/{soId}/streams/{streamId}".sub('{format}','json').sub('{' + 'soId' + '}', escapeString(so_id))
    .sub('{' + 'streamId' + '}', escapeString(stream_id))
    
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    
  end

def self.get_streams (so_id,opts={})
    query_param_keys = []

    # verify existence of params
    raise "so_id is required" if so_id.nil?
    # set default values and merge with input
    options = {
    :so_id => so_id}.merge(opts)

    #resource path
    path = "/things/{soId}/streams".sub('{format}','json').sub('{' + 'soId' + '}', escapeString(so_id))
    
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    
  end

end

